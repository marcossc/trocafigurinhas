/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.Serializable;

/**
 *
 * @author marcos.castanheira
 */
public class IPPorta implements Serializable{
    
    private String ip;
    private int porta;

    public IPPorta(String ip, int porta) {
        setIp(ip);
        setPorta(porta);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip.substring(1);
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "IPPorta{" + "ip=" + ip + ", porta=" + porta + '}';
    }
    
}
