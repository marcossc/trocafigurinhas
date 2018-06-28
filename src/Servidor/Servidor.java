package Servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor implements Runnable{

    private static DatagramSocket socket = null;
    private final String broadcastMessage;

    public Servidor(String broadcastMessage) {
        this.broadcastMessage = broadcastMessage;
    }
    
    @Override
    public void run() {
        try {
            byte[] buffer = broadcastMessage.getBytes();

            DatagramPacket packet = null;
            List<InetAddress> lista = listAllBroadcastAddresses();
            for(InetAddress n: lista){
                packet = new DatagramPacket(buffer, buffer.length, n, 6789);
                socket = new DatagramSocket();
                socket.setBroadcast(true);
                socket.send(packet);
                socket.close();
            }
        } catch(Exception e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static List<InetAddress> listAllBroadcastAddresses() throws SocketException {
        List<InetAddress> broadcastList = new ArrayList<>();
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = interfaces.nextElement();

            if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                //continue;
            }
            networkInterface.getInterfaceAddresses().stream().map(a -> a.getBroadcast()).filter(Objects::nonNull).forEach(broadcastList::add);
        }
        return broadcastList;
    }
    
    /*public static void main(String[] args) throws ClassNotFoundException, IOException {
       new Thread(new Servidor("Funcionou essa caralha")).start();
    }*/
    
}
