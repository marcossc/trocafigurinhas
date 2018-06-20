package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor implements Runnable{

    private ServerSocket serverSocket = null;
    private Socket listenSocket = null;
    private int porta;
    private ArrayList<IPPorta> ativos = new ArrayList<>();    

    public Servidor(int porta) {
        this.porta = porta;
        /*
        ativos.add(new IPPorta("192.168.0.1", 1234));
        ativos.add(new IPPorta("192.168.0.2", 1235));
        ativos.add(new IPPorta("192.168.0.3", 1236));
        ativos.add(new IPPorta("192.168.0.4", 1237));
        */
    }
    
    @Override
    public void run() {
        try {
            do{serverSocket = new ServerSocket(porta);
                System.out.println("Aguardando conexao...");
                listenSocket = serverSocket.accept();
                System.out.println("Cliente conectado!");
                DataInputStream dis = new DataInputStream(listenSocket.getInputStream());
                ObjectOutputStream dos = new ObjectOutputStream(listenSocket.getOutputStream());
                int portaCliente = Integer.parseInt(dis.readUTF());
                ativos.add(new IPPorta(listenSocket.getInetAddress().toString(), portaCliente));

                
                dos.writeObject(ativos);
                listenSocket.close();
                serverSocket.close();
                System.out.println("Lista de ativos enviada!");
            }while(true);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(listenSocket != null){
                try {
                    listenSocket.close();
                    serverSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
