/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Serva Vitoriosa
 */
public class FrmBackup extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public FrmBackup() {
        initComponents();
        
        new Thread() {
            
       public void run () {
        
       for (int i =0;  i <101; i++  ){
        
           
           try {
               sleep (80);
               jProgressBar1.setValue(i);
               if(jProgressBar1.getValue() <= 40) {
               jLabel1.setText("Organizando Banco de Dados");
           }else if(jProgressBar1.getValue() <= 70){
           jLabel1.setText("Copiando Tabelas");
           }else {
           jLabel1.setText("copiando para pasta ");
           
           
           }
               
           } catch (InterruptedException ex) {
               Logger.getLogger(FrmBackup.class.getName()).log(Level.SEVERE, null, ex);
                  
                     }
           
                  }
           JOptionPane.showMessageDialog(null,"backup realizado com sucesso.");
           dispose();
           
       
              }    
            
    }.start();
     
    
                }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mageia-default-3840x2160-650px-75767.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setFocusableWindowState(false);
        setName(""); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(102, 102, 255));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setMinimumSize(new java.awt.Dimension(10, 10));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 160, 500, 10);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 180, 230, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Ver 1.0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 100, 70, 20);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("SisInfo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 10, 320, 80);

        setSize(new java.awt.Dimension(503, 233));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       FrmBackup Sp = new FrmBackup();
       Sp.setVisible(true);
   
       

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBackup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}