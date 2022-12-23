/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControllerServico;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import utilitario.ConectaBanco;
import modelo.ModelServico;
import utilitario.ModeloTabe;

/**
 *
 * @author Serva Vitoriosa
 */
public class FrmConsultarServicos extends javax.swing.JFrame {

    private FrmCadastroOs frmCadastroOs;
//    private FrmCadastroServicos frmCadastroServicos;
    ConectaBanco con = new ConectaBanco();

    public FrmConsultarServicos() {
        initComponents();
        con.conexao();
        preencherTabel("Select * from tbl_servico order by id");

    }

    //construtor com parametro para buscar cliente
    public FrmConsultarServicos(FrmCadastroOs frmCadastroOs) {
        con.conexao();
        this.frmCadastroOs = frmCadastroOs;
        initComponents();
        preencherTabel("Select * from tbl_servico order by id");
    }

//    //construtor com parametro para buscar clientes
//    public FrmConsultarServicos(FrmCadastroClientes frmClientes) {
//   
//        initComponents();
//    }
//
//    public ModelServico getServico() {
//        return servico;
//    }
//
//    public void setServico(ModelServico servico) {
//        this.servico = servico;
//    }
//
//    public FrmConsultarServicos consultaServicos;
//    public ModelServico servico;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicos = new javax.swing.JTable();
        jTextFieldPesquisar1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonNovo2 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair1 = new javax.swing.JButton();
        jButtonAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Serviços");
        setExtendedState(6);
        setResizable(false);

        jTableServicos.setBackground(new java.awt.Color(255, 255, 204));
        jTableServicos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableServicos.setForeground(new java.awt.Color(0, 0, 102));
        jTableServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableServicos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableServicosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableServicosFocusLost(evt);
            }
        });
        jTableServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableServicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableServicos);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonNovo2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonAlterar1)
                            .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSair1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServicosMouseClicked
        con.conexao();

        if (evt.getClickCount() == 2) {
            FrmCadastroOs frmCadastroOs = new FrmCadastroOs();

            int id = ((int) jTableServicos.getValueAt(jTableServicos.getSelectedRow(), 0));
            String servico = ((String) jTableServicos.getValueAt(jTableServicos.getSelectedRow(), 1));
            int quantidade = ((int) jTableServicos.getValueAt(jTableServicos.getSelectedRow(), 2));
            String valorunitario = ((String) jTableServicos.getValueAt(jTableServicos.getSelectedRow(), 3));
            String valortotal = ((String) jTableServicos.getValueAt(jTableServicos.getSelectedRow(), 4));

            this.frmCadastroOs.buscarServico(id, servico, quantidade, valorunitario, valortotal);
            this.frmCadastroOs.setVisible(true);
            setVisible(false);
//            this.dispose();

        }

// //obtem a linha da tabela
//        int row = jTableServicos.getSelectedRow();
//        
//        servico = new ModelServico();
//        
//        //coloca valores na instancia de produto
//        servico.setId((Integer) jTableServicos.getValueAt(row, 0));
//        servico.setServico((String) jTableServicos.getValueAt(row, 1));
//        servico.setQuantidade((Integer) jTableServicos.getValueAt(row, 2));
//        servico.setValorUnitario((String) jTableServicos.getValueAt(row, 3));
//        servico.setValorTotal((String) jTableServicos.getValueAt(row, 4));
//        this.dispose();        
    }//GEN-LAST:event_jTableServicosMouseClicked

    private void jTextFieldPesquisar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1KeyReleased
        preencherTabel("Select * from tbl_servico where   servico ilike '%" + jTextFieldPesquisar1.getText() + "%'");


    }//GEN-LAST:event_jTextFieldPesquisar1KeyReleased

    private void jTextFieldPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisar1ActionPerformed

    private void jButtonNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo2ActionPerformed

        FrmCadastroServicos frmCadastroServicos = new FrmCadastroServicos();
        frmCadastroServicos.setVisible(true);         // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo2ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        con.conexao();
        ModelServico modeloServico = new ModelServico();

        if (jTableServicos.getSelectedRow() >= 0) {

            modeloServico.setId((int) jTableServicos.getValueAt(jTableServicos.getSelectedRow(), 0));

            ControllerServico controllerServico = new ControllerServico();
            controllerServico.excluir(modeloServico);
            preencherTabel("Select * from tbl_servico order by id ");


    }//GEN-LAST:event_jButtonExcluirActionPerformed
    }
    private void jButtonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSair1ActionPerformed

    private void jButtonAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterar1ActionPerformed

    private void jTableServicosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableServicosFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableServicosFocusLost

    private void jTableServicosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableServicosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableServicosFocusGained

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
            java.util.logging.Logger.getLogger(FrmConsultarServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarServicos().setVisible(true);
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
    private javax.swing.JTable jTableServicos;
    private javax.swing.JTextField jTextFieldPesquisar1;
    // End of variables declaration//GEN-END:variables

    public void preencherTabel(String SQL) {

        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"ID", "Servico", "Quantidade", "Valor Unitario", "Valor Total"};
        con.conexao();
        con.executaSQL(SQL);

        try {

            con.rs.first();
            do {

                dados.add(new Object[]{con.rs.getInt("id"), con.rs.getString("servico"), con.rs.getInt("quantidade"), con.rs.getString("valorunitario"), con.rs.getString("valortotal")});

            } while (con.rs.next());

        } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null,"Sem Registros no banco de dados!");

        }
        ModeloTabe model = new ModeloTabe(dados, Colunas);
        jTableServicos.setModel(model);
        jTableServicos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableServicos.getColumnModel().getColumn(0).setResizable(false);
        jTableServicos.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableServicos.getColumnModel().getColumn(1).setResizable(false);
        jTableServicos.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableServicos.getColumnModel().getColumn(2).setResizable(false);
        jTableServicos.getColumnModel().getColumn(3).setPreferredWidth(187);
        jTableServicos.getColumnModel().getColumn(3).setResizable(false);
        jTableServicos.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTableServicos.getColumnModel().getColumn(4).setResizable(false);
        jTableServicos.getTableHeader().setReorderingAllowed(false);
        jTableServicos.setAutoResizeMode(jTableServicos.AUTO_RESIZE_OFF);
        jTableServicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        con.desconecta();
    }

//    private FrmCadastroOs frmCadastroOs;
//        
//     public void mostrarTela(FrmCadastroOs cadOs){
//         this.frmCadastroOs = cadOs;
//         setVisible(true);
//         
//     }   
}
