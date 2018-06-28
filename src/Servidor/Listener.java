package Servidor;

import Figurinhas.FigurinhasRepo;
import Figurinhas.ListaFigurinhasPossui;
import java.awt.Dimension;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Listener implements Runnable {

    private ListaFigurinhasPossui possui = new ListaFigurinhasPossui();

    public Listener(ListaFigurinhasPossui possui) {
        this.possui = possui;
    }

    @Override
    public void run() {
        DatagramSocket aSocket = null;
        String figurinhaSolicitada;
        try {
            aSocket = new DatagramSocket(6789);
            boolean exibir;
            byte[] buffer = new byte[1000];
            while (true) {
                System.out.println("Listener aguardando conexão...");
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                figurinhaSolicitada = new String(request.getData()).trim();
                //System.out.println(request.getAddress()+" sender");
                List<InetAddress> listaSender = listSenderAddresses();
                exibir = true;
                for(InetAddress e: listaSender){
                    if(request.getAddress().equals(e))
                        exibir = false;
                }
                int ret;
                if(!exibir)
                    ret = -1;
                else ret = JOptionPane.showConfirmDialog(null, "Alguém quer a figurinha " + figurinhaSolicitada + ", trocar?");
                System.out.println(ret);
                //0 = sim, 1 = não, 3 = cancelar
                
                //Funcionalidade de troca lado solicitado
                if (ret == 0 && possui.getQtd(Integer.parseInt(figurinhaSolicitada)) > 0) {
                    boolean aceito = false;
                    Socket socketCliente = null;
                    try {
                        System.out.println("Conectando ao servidor " + request.getAddress() + " na porta 6790");
                        socketCliente = new Socket(request.getAddress(), 6790);
                        System.out.println("Conectado ao Servidor!");
                        ObjectInputStream ois = new ObjectInputStream(socketCliente.getInputStream());
                        DataOutputStream dos = new DataOutputStream(socketCliente.getOutputStream());

                        ListaFigurinhasPossui lista = (ListaFigurinhasPossui) ois.readObject();
                        while (!aceito) {
                            String retorno = "";
                            for (int i = 1; i <= 681; i++) {
                                if (lista.getQtd(i) > 1) {
                                    retorno = retorno.concat(FigurinhasRepo.lista().get(i) + " - " + possui.getQtd(i) + "\n");
                                }
                            }
                            JTextArea textArea = new JTextArea(retorno);
                            JScrollPane scrollPane = new JScrollPane(textArea);
                            textArea.setLineWrap(true);
                            textArea.setWrapStyleWord(true);
                            scrollPane.setPreferredSize(new Dimension(500, 500));
                            JOptionPane.showMessageDialog(null, scrollPane, "Lista de figurinhas para troca do amiguinho", JOptionPane.INFORMATION_MESSAGE);
                            String figurinhaTrocar = JOptionPane.showInputDialog(null, "Insira o número da figurinha que você deseja:", "Entrada", JOptionPane.QUESTION_MESSAGE);
                            while (!(Integer.parseInt(figurinhaTrocar) > 0 && Integer.parseInt(figurinhaTrocar) < 682)) {
                                figurinhaTrocar = JOptionPane.showInputDialog(this, "Insira o número da figurinha que você deseja:");
                            }
                            dos.writeUTF(figurinhaTrocar);
                            if (ois.readUTF().equals("aceito")) {
                                aceito = true;
                                possui.removerFigurinha(Integer.parseInt(figurinhaTrocar));
                                possui.adicionarFigurinha(Integer.parseInt(figurinhaSolicitada));
                                JOptionPane.showMessageDialog(null, "Troca realizada!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            if (socketCliente != null) {
                                socketCliente.close();
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {

                }
            }
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if (aSocket != null) {
                aSocket.close();
            }
        }
    }
    
    public static List<InetAddress> listSenderAddresses() throws SocketException {
        List<InetAddress> broadcastList = new ArrayList<>();
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = interfaces.nextElement();

            if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                continue;
            }
            networkInterface.getInterfaceAddresses().stream().map(a -> a.getAddress()).filter(Objects::nonNull).forEach(broadcastList::add);
        }
        return broadcastList;
    }
}
