package Servidor;

import Figurinhas.ListaFigurinhasPossui;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ServidorTroca implements Runnable {

    public ListaFigurinhasPossui possui;
    private int figurinha;

    public ServidorTroca(ListaFigurinhasPossui possui, int figurinha) {
        this.possui = possui;
        this.figurinha = figurinha;
    }

    @Override
    public void run() {
        ServerSocket serverSocket = null;
        Socket listenSocket = null;
        boolean trocaRealizada = false;
        System.out.println("ServidorTroca iniciado");
        try {
            String mensagem;
            serverSocket = new ServerSocket(6790);
            System.out.println("Aguardando conexao...");
            listenSocket = serverSocket.accept();
            System.out.println("Cliente conectado!!");
            DataInputStream dis = new DataInputStream(listenSocket.getInputStream());
            DataOutputStream dos = new DataOutputStream(listenSocket.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(listenSocket.getOutputStream());

            oos.writeObject(possui);
            while (!trocaRealizada) {
                mensagem = dis.readUTF();
                int ret = JOptionPane.showConfirmDialog(null, "Seu amigo tem a figurinha que você solicitou e quer a figurinha " + mensagem + ", trocar?");
                //0 = sim, 1 = não, 3 = cancelar
                if (ret == 0) {
                    dos.writeUTF("aceito");
                    trocaRealizada = true;
                    possui.adicionarFigurinha(figurinha);
                    possui.removerFigurinha(Integer.parseInt(mensagem));
                    JOptionPane.showMessageDialog(null, "Troca realizada!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    oos.writeUTF("nah");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServidorTroca.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (listenSocket != null) {
                try {
                    listenSocket.close();
                    serverSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(ServidorTroca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
