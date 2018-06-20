package Servidor;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteTeste {

    public static void main(String[] args) throws ClassNotFoundException {
        Socket socketCliente = null;
        try {
            socketCliente = new Socket("localhost", 6789);
            System.out.println("Conectado ao Servidor!");
            ObjectInputStream dis = new ObjectInputStream(
                    socketCliente.getInputStream());
            DataOutputStream dos = new DataOutputStream(
                    socketCliente.getOutputStream());
            
            dos.writeUTF("lista");
            
            ArrayList<IPPorta> mensagem = (ArrayList) dis.readObject();
            
            for(IPPorta p: mensagem){
                System.out.println(p.toString());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ClienteTeste.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(socketCliente != null)
                    socketCliente.close();
            } catch (IOException ex) {
                Logger.getLogger(ClienteTeste.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
