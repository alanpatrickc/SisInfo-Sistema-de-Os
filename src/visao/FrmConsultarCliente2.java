/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControllerCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import utilitario.ConectaBanco;
import modelo.ModelCliente;
import utilitario.ModeloTabe;

/**
 *
 * @author Serva Vitoriosa
 */
public class FrmConsultarCliente2 extends javax.swing.JFrame  {
    private FrmCadastroClientes frmClientes;
    ConectaBanco con = new ConectaBanco();
    
    public FrmConsultarCliente2() {
        initComponents();
        con.conexao();
        preencherTabel("Select * from cliente order by id_cliente");
         
       
  }
public FrmConsultarCliente2(FrmCadastroClientes frmClientes){
 this.frmClientes = frmClientes;
  initComponents();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEsta = new javax.swing.JTable();
        jTextFieldPesquisar1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonNovo2 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair1 = new javax.swing.JButton();
        jButtonAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jTableEsta.setBackground(new java.awt.Color(255, 255, 204));
        jTableEsta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableEsta.setForeground(new java.awt.Color(0, 0, 102));
        jTableEsta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEsta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableEstaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableEstaFocusLost(evt);
            }
        });
        jTableEsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEsta);

        jTextFieldPesquisar1.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldPesquisar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisar1ActionPerformed(evt);
            }
        });
        jTextFieldPesquisar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisar1KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag.png"))); // NOI18N
        jLabel11.setToolTipText("Pesquisar");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButtonNovo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        jButtonNovo2.setToolTipText("Novo");
        jButtonNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo2ActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edittrash.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Deletar");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonSair1.setToolTipText("Sair");
        jButtonSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSair1ActionPerformed(evt);
            }
        });

        jButtonAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        jButtonAlterar1.setToolTipText("Aterar");
        jButtonAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jButtonNovo2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jButtonSair1)
                            .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstaMouseClicked
   con.conexao();

   if(evt.getClickCount()== 2){       
   FrmCadastroClientes frmClientes = new FrmCadastroClientes();
//   ModelCliente modeloCliente = new ModelCliente();
//   int x = jTableEsta.getSelectedRow();
//
//   Object    id_cliente = jTableEsta.getValueAt(x,0); 
//   Object nome_cliente = jTableEsta.getValueAt(x,1); 
//   Object end_cliente = jTableEsta.getValueAt(x,2); 
//   Object cid_cliente = jTableEsta.getValueAt(x,3);
//   Object tel_cli = jTableEsta.getValueAt(x,4);
//   Object bairro_cli = jTableEsta.getValueAt(x,5);
//   Object cep_cli = jTableEsta.getValueAt(x,6);
//   Object cpf_cliente = jTableEsta.getValueAt(x,7);
//   Object uf = jTableEsta.getValueAt(x,8);
   
//    int id_cliente =((int)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow() ,0));
//    String nome_cliente =((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),1));
//    String end_cliente = ((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),2));
//    String cid_cliente = ((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),3));
//    String tel_cli = ((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),4));
//    String bairro_cli = ((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),5));
//    String cep_cli = ((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),6));
//    String cpf_cliente =((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),7));
//    String uf = ((String)jTableEsta.getModel().getValueAt(jTableEsta.getSelectedRow(),8));

    int id_cliente =((int)jTableEsta.getValueAt(jTableEsta.getSelectedRow() ,0));
    String nome_cliente =((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),1));
    String end_cliente = ((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),2));
    String cid_cliente = ((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),3));
    String tel_cli = ((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),4));
    String bairro_cli = ((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),5));
    String cep_cli = ((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),6));
    String cpf_cliente =((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),7));
    String uf = ((String)jTableEsta.getValueAt(jTableEsta.getSelectedRow(),8));
   
//  frmClientes.buscarFilme(Integer.parseInt(id_cliente.toString()), nome_cliente.toString(),end_cliente.toString()
//  , cid_cliente.toString(), tel_cli.toString(), bairro_cli.toString(), cep_cli.toString()
//  , cpf_cliente.toString(),uf.toString());
//  frmClientes.setVisible(true);
  frmClientes.buscarCliente( id_cliente, nome_cliente, end_cliente, cid_cliente, tel_cli, bairro_cli, cep_cli, cpf_cliente, uf);
  frmClientes.setVisible(true);                               
  this.dispose();
     
                              
}
    }//GEN-LAST:event_jTableEstaMouseClicked

    private void jTextFieldPesquisar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1KeyReleased
   preencherTabel("Select * from cliente where   nome_cliente ilike '%"+jTextFieldPesquisar1.getText()+"%'");    

    
    }//GEN-LAST:event_jTextFieldPesquisar1KeyReleased

    private void jTextFieldPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisar1ActionPerformed

    private void jButtonNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo2ActionPerformed

        FrmCadastroClientes frm = new FrmCadastroClientes();
        frm.setVisible(true); 
             // TODO add your handling code here:
                                     // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo2ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
      con.conexao();
      ModelCliente modeloCliente = new ModelCliente();
        
      if (jTableEsta.getSelectedRow() >= 0){ 
    
      modeloCliente.setCodigo((int)jTableEsta.getValueAt(jTableEsta.getSelectedRow() ,0));
      

     ControllerCliente controladorCliente = new ControllerCliente();
     controladorCliente.excluir(modeloCliente);
     preencherTabel("Select * from cliente order by id_cliente");



                
           
             
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    }
    private void jButtonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSair1ActionPerformed

    private void jButtonAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterar1ActionPerformed

    private void jTableEstaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableEstaFocusLost
      // TODO add your handling code here:
    }//GEN-LAST:event_jTableEstaFocusLost

    private void jTableEstaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableEstaFocusGained
       // TODO add your handling code here:
    }//GEN-LAST:event_jTableEstaFocusGained

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
            java.util.logging.Logger.getLogger(FrmConsultarCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarCliente2().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar1;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo2;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEsta;
    private javax.swing.JTextField jTextFieldPesquisar1;
    // End of variables declaration//GEN-END:variables


    
    
    
    public  void preencherTabel(String SQL){
     
    ArrayList dados = new ArrayList();
    
     String [] Colunas = new String[] {"Cod","Cliente","Endereço","Cidade","Telefone","Bairro","CEP","CPF","UF"};
  con.conexao();
     con.executaSQL(SQL);  

   
 
  
     
      try {     
     
    
      
      con.rs.first();
     do{
                   
            dados.add(new Object[]{con.rs.getInt("id_cliente"),con.rs.getString("nome_cliente"),con.rs.getString("end_cliente"),con.rs.getString("cid_cliente"),con.rs.getString("tel_cli"),con.rs.getString("bairro_cli"),con.rs.getString("cep_cli"),con.rs.getString("cpf_cliente"),con.rs.getString("uf")});
            
       }while(con.rs.next());

        } catch (SQLException ex){
//        JOptionPane.showMessageDialog(null,"Sem Registros no banco de dados!");
        
        }
       ModeloTabe  model = new ModeloTabe(dados,Colunas);
       jTableEsta.setModel(model);
       jTableEsta.getColumnModel().getColumn(0).setPreferredWidth(40);
       jTableEsta.getColumnModel().getColumn(0).setResizable(false);
       jTableEsta.getColumnModel().getColumn(1).setPreferredWidth(300);
       jTableEsta.getColumnModel().getColumn(1).setResizable(false);
       jTableEsta.getColumnModel().getColumn(2).setPreferredWidth(200);
       jTableEsta.getColumnModel().getColumn(2).setResizable(false);
       jTableEsta.getColumnModel().getColumn(3).setPreferredWidth(187);
       jTableEsta.getColumnModel().getColumn(3).setResizable(false);
       jTableEsta.getColumnModel().getColumn(4).setPreferredWidth(130);
       jTableEsta.getColumnModel().getColumn(4).setResizable(false);
       jTableEsta.getColumnModel().getColumn(5).setPreferredWidth(130);
       jTableEsta.getColumnModel().getColumn(5).setResizable(false);
       jTableEsta.getColumnModel().getColumn(6).setPreferredWidth(130);
       jTableEsta.getColumnModel().getColumn(6).setResizable(false);
       jTableEsta.getColumnModel().getColumn(7).setPreferredWidth(130);
       jTableEsta.getColumnModel().getColumn(7).setResizable(false);
       jTableEsta.getColumnModel().getColumn(8).setPreferredWidth(100);
       jTableEsta.getColumnModel().getColumn(8).setResizable(false);
       jTableEsta.getTableHeader().setReorderingAllowed(false);
       jTableEsta.setAutoResizeMode(jTableEsta.AUTO_RESIZE_OFF);
       jTableEsta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       con.desconecta();
}   

    }  



