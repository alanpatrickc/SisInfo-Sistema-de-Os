/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import utilitario.ConectaBanco;
import utilitario.ModeloTabe;

/**
 *
 * @author AD
 */
public class FrmConsultarCliente1 extends javax.swing.JFrame {

    ConectaBanco con = new ConectaBanco();

    /**
     * Creates new form FrmConsultarCliente
     */
    public FrmConsultarCliente1() {
        initComponents();
        con.conexao();
        preencherTabel("Select * from cliente order by id_cliente");

    }
// public FrmConsultarCliente1(FrmConsultarCliente1 frmConsultarClientes){
// this.frmConsultarClientes = frmConsultarClientes;
//  initComponents();
//}

    public void preencherTabel(String SQL) {

        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"Cliente", "Telefone"};
        con.conexao();
        con.executaSQL(SQL);

        try {

            con.rs.first();
            do {

                dados.add(new Object[]{con.rs.getString("nome_cliente"), con.rs.getString("tel_cli")});

            } while (con.rs.next());

        } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null,"Sem Registros no banco de dados!");

        }
        ModeloTabe modelo = new ModeloTabe(dados, Colunas);
        jTableConsultarClientes.setModel(modelo);
        jTableConsultarClientes.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTableConsultarClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableConsultarClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableConsultarClientes.getColumnModel().getColumn(1).setResizable(false);

        jTableConsultarClientes.getTableHeader().setReorderingAllowed(false);
        jTableConsultarClientes.setAutoResizeMode(jTableConsultarClientes.AUTO_RESIZE_OFF);
        jTableConsultarClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        con.desconecta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultarClientes = new javax.swing.JTable();
        jTextFieldPesquisar1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Clientes");

        jTableConsultarClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableConsultarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultarClientes);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisar1ActionPerformed

    private void jTextFieldPesquisar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1KeyReleased
        preencherTabel("Select * from cliente where   nome_cliente ilike '%" + jTextFieldPesquisar1.getText() + "%'");

    }//GEN-LAST:event_jTextFieldPesquisar1KeyReleased

    private void jTableConsultarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarClientesMouseClicked
        con.conexao();

        if (evt.getClickCount() == 2) {
            FrmCadastroOs frmOs = new FrmCadastroOs();

            String nome_cliente = ((String) jTableConsultarClientes.getValueAt(jTableConsultarClientes.getSelectedRow(), 0));
            String tel_cli = ((String) jTableConsultarClientes.getValueAt(jTableConsultarClientes.getSelectedRow(), 1));

            frmOs.buscarCliente(nome_cliente, tel_cli);
            frmOs.setVisible(true);
            this.dispose();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTableConsultarClientesMouseClicked

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
            java.util.logging.Logger.getLogger(FrmConsultarCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarCliente1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultarClientes;
    private javax.swing.JTextField jTextFieldPesquisar1;
    // End of variables declaration//GEN-END:variables
}
