package Figurinhas;

import Servidor.IPPorta;
import java.awt.Dimension;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author marcos.castanheira
 */
public class Principal extends javax.swing.JFrame {

    private ListaFigurinhasPossui possui = new ListaFigurinhasPossui();
    private int porta;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        salvarPorta();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        solicitar = new javax.swing.JButton();
        campoPorta = new javax.swing.JTextField();
        salvaPorta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listar.setText("Listar Figurinhas");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        solicitar.setText("Solicitar Figurinha");
        solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarActionPerformed(evt);
            }
        });

        campoPorta.setText("12345");

        salvaPorta.setText("Salvar");
        salvaPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaPortaActionPerformed(evt);
            }
        });

        jLabel1.setText("Porta a utilizar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solicitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvaPorta)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listar)
                    .addComponent(campoPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvaPorta)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solicitar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        String retorno = "";
        for(int i = 1; i <= 681 ; i++){
            retorno = retorno.concat(FigurinhasRepo.lista().get(i) + " - " + possui.getQtd(i) + "\n");
        }
        //JOptionPane.showMessageDialog(this, retorno);
        JTextArea textArea = new JTextArea(retorno);
        JScrollPane scrollPane = new JScrollPane(textArea);  
        textArea.setLineWrap(true);  
        textArea.setWrapStyleWord(true); 
        scrollPane.setPreferredSize(new Dimension(500, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de figurinhas", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_listarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        int num = 0;
        do{
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog(this, "Insira o número da figurinha:"));
                if(num < 1 || num > 681)
                    throw new Exception("Número inválido!");
                if(possui.removerFigurinha(num))
                    JOptionPane.showMessageDialog(this, "Removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                else
                    throw new Exception("Você não possui essa figurinha!");
            }catch(Exception e){
                num = 0;
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }while(num == 0);
    }//GEN-LAST:event_removerActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        int num = 0;
        do{
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog(this, "Insira o número da figurinha:"));
                if(num < 1 || num > 681)
                    throw new Exception();
            }catch(Exception e){
                num = 0;
                JOptionPane.showMessageDialog(this, "Número inválido", "Número inválido", JOptionPane.ERROR_MESSAGE);
            }
        }while(num == 0);
        possui.adicionarFigurinha(num);
        JOptionPane.showMessageDialog(this, "Adicionada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_adicionarActionPerformed

    private void solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarActionPerformed
        Socket socketCliente = null;
        try {
            socketCliente = new Socket("localhost", 6789);
            System.out.println("Conectado ao Servidor!");
            ObjectInputStream dis = new ObjectInputStream(
                    socketCliente.getInputStream());
            DataOutputStream dos = new DataOutputStream(
                    socketCliente.getOutputStream());
            
            dos.writeUTF(String.valueOf(porta));
            
            ArrayList<IPPorta> mensagem = (ArrayList) dis.readObject();
            String retorno = "";
            for(IPPorta p: mensagem){
                retorno = retorno + p.toString() + "\n";
            }
            JTextArea textArea = new JTextArea(retorno);
            JScrollPane scrollPane = new JScrollPane(textArea);  
            textArea.setLineWrap(true);  
            textArea.setWrapStyleWord(true); 
            scrollPane.setPreferredSize(new Dimension(500, 500));
            JOptionPane.showMessageDialog(null, scrollPane, "Clientes ativos", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(socketCliente != null)
                    socketCliente.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_solicitarActionPerformed

    private void salvaPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaPortaActionPerformed
        salvarPorta();
    }//GEN-LAST:event_salvaPortaActionPerformed

    private void salvarPorta(){
        int aux;
        try{
            aux = Integer.parseInt(campoPorta.getText());
            if(aux > 0 && aux < 49152){
                porta = aux;
                JOptionPane.showMessageDialog(this, "Porta do servidor alterada para " + porta, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }else
                throw new Exception();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Porta Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        campoPorta.setText(String.valueOf(porta));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JTextField campoPorta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listar;
    private javax.swing.JButton remover;
    private javax.swing.JButton salvaPorta;
    private javax.swing.JButton solicitar;
    // End of variables declaration//GEN-END:variables
}
