/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControllerCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import utilitario.ConectaBanco;
import modelo.ModelCliente;

/**
 *
 * @author Serva Vitoriosa
 */
public class FrmCadastroClientes extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
//    ConectaBanco conexaoPesquisa = new ConectaBanco();
//    ConectaBanco pesquisar = new ConectaBanco();
    ModelCliente mod = new ModelCliente();

//   private Integer id_cliente = 0;
    public FrmCadastroClientes() {

        initComponents();
        conecta.conexao();

        listarEstados();
//   preencherTabela("Select * from cliente order by id_cliente");

    }
//  ,String uf_cli  

    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public void buscarCliente(Integer id_cliente, String nome_cliente, String end_cliente,
            String cid_cliente, String tel_cli, String bairro_cli, String cep_cli, String cpf_cliente, String uf) {

        jTextFieldCod.setText(String.valueOf(id_cliente));
        jTextFieldNome.setText(nome_cliente);
        jTextFieldEndereco.setText(end_cliente);

        jComboBoxUf.addItem(uf);
        for (int dor = 0; dor < jComboBoxUf.getItemCount(); dor++) {
            if (jComboBoxUf.getItemAt(dor).equals(uf)) {
                jComboBoxUf.setSelectedIndex(dor);
            }

            jComboBoxCidade.addItem(cid_cliente);
            for (int contador = 0; contador < jComboBoxCidade.getItemCount(); contador++) {
                if (jComboBoxCidade.getItemAt(contador).equals(cid_cliente)) {
                    jComboBoxCidade.setSelectedIndex(contador);
                }

                jFormattedTextFieldCep.setText(cep_cli);
                jTextFieldBairro.setText(bairro_cli);
                jFormattedTextFieldTel.setText(tel_cli);
                jFormattedTextFieldCpf.setText(cpf_cliente);

            }

        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxUf = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setBackground(new java.awt.Color(255, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CPF:");

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldCod.setEnabled(true);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });
        jTextFieldCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodKeyPressed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filesave.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        jTextFieldEndereco.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEnderecoKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setText("Bairro:");

        jTextFieldBairro.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBairroKeyPressed(evt);
            }
        });

        jTextFieldNome.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("TEL:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("CEP:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("UF:");

        jFormattedTextFieldTel.setBackground(new java.awt.Color(153, 255, 204));
        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelActionPerformed(evt);
            }
        });

        jFormattedTextFieldCep.setBackground(new java.awt.Color(153, 255, 204));
        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCepActionPerformed(evt);
            }
        });
        jFormattedTextFieldCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCepKeyPressed(evt);
            }
        });

        jFormattedTextFieldCpf.setBackground(new java.awt.Color(153, 255, 204));
        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCpfKeyPressed(evt);
            }
        });

        jComboBoxCidade.setBackground(new java.awt.Color(153, 255, 204));
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha" }));
        jComboBoxCidade.setPreferredSize(new java.awt.Dimension(73, 20));
        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });
        jComboBoxCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxCidadeKeyPressed(evt);
            }
        });

        jComboBoxUf.setBackground(new java.awt.Color(153, 255, 204));
        jComboBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha" }));
        jComboBoxUf.setPreferredSize(new java.awt.Dimension(73, 20));
        jComboBoxUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUfActionPerformed(evt);
            }
        });
        jComboBoxUf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxUfKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        jButton1.setToolTipText("Novo");
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Aterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edittrash.png"))); // NOI18N
        jButton3.setToolTipText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(jButtonAlterar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSair))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                                .addComponent(jTextFieldBairro)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(8, 8, 8)
                                    .addComponent(jComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit_group.png"))); // NOI18N
        jLabel1.setText("          Cadastro de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(729, 412));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (jTextFieldEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Endereço é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (jFormattedTextFieldTel.getFormatter().equals("( )    -   ")) {
            JOptionPane.showMessageDialog(null, "O campo Tel é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jComboBoxCidade.getSelectedItem().equals("Escolha")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        FrmConsultarCliente2 frm = new FrmConsultarCliente2();
        mod.setNome(jTextFieldNome.getText());
        mod.setCpf(jFormattedTextFieldCpf.getText());
        mod.setEndereço(jTextFieldEndereco.getText());
        mod.setCidade((String) jComboBoxCidade.getSelectedItem());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCep(jFormattedTextFieldCep.getText());
        mod.setTelefone(jFormattedTextFieldTel.getText());
        mod.setUf_cliente((String) jComboBoxUf.getSelectedItem());
        ControllerCliente control = new ControllerCliente();
        control.salvar(mod);
        frm.preencherTabel("Select * from cliente order by id_cliente");
        frm.setAutoRequestFocus(true);
        dispose();


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelActionPerformed

    private void jComboBoxUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUfActionPerformed

        String dados[] = String.valueOf(jComboBoxUf.getSelectedItem()).split(" - ");
        if (!dados[0].equalsIgnoreCase("Escolha")) {
            jComboBoxCidade.removeAllItems();
            jComboBoxCidade.addItem("Escolha");
            listarCidades(dados[0]);
        }
    }//GEN-LAST:event_jComboBoxUfActionPerformed

    private void jFormattedTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldCod.setText(String.valueOf(""));
        jTextFieldNome.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldEndereco.setText("");
        jComboBoxCidade.setSelectedItem("Escolha");
        jTextFieldBairro.setText("");
        jFormattedTextFieldCep.setText("");
        jFormattedTextFieldTel.setText("");
        jComboBoxUf.setSelectedItem("Escolha");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed


    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        mod.setNome(jTextFieldNome.getText());
        mod.setCpf(jFormattedTextFieldCpf.getText());
        mod.setEndereço(jTextFieldEndereco.getText());
        mod.setCidade((String) jComboBoxCidade.getSelectedItem());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCep(jFormattedTextFieldCep.getText());
        mod.setTelefone(jFormattedTextFieldTel.getText());
        mod.setUf_cliente((String) jComboBoxUf.getSelectedItem());
        ControllerCliente atualizar = new ControllerCliente();
        atualizar.alterar(mod);

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        mod.setNome(jTextFieldNome.getText());
        mod.setCpf(jFormattedTextFieldCpf.getText());
        mod.setEndereço(jTextFieldEndereco.getText());
        mod.setCidade((String) jComboBoxCidade.getSelectedItem());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCep(jFormattedTextFieldCep.getText());
        mod.setTelefone(jFormattedTextFieldTel.getText());
        mod.setUf_cliente((String) jComboBoxUf.getSelectedItem());
        ControllerCliente control = new ControllerCliente();
        control.excluir(mod);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFormattedTextFieldCpf.requestFocus();

    }//GEN-LAST:event_jTextFieldNomeKeyPressed
    }
    private void jTextFieldCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTextFieldNome.requestFocus();
        }                                     // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodKeyPressed

    private void jFormattedTextFieldCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTextFieldEndereco.requestFocus();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfKeyPressed

    private void jTextFieldEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jComboBoxUf.requestFocus();
        }           // TODO add your handli  // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoKeyPressed

    private void jComboBoxUfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxUfKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jComboBoxCidade.requestFocus();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUfKeyPressed

    private void jComboBoxCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxCidadeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTextFieldBairro.requestFocus();
        }         // TOD // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCidadeKeyPressed

    private void jTextFieldBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBairroKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFormattedTextFieldCep.requestFocus();
        }         // TOD // TODO add your handling    // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroKeyPressed

    private void jFormattedTextFieldCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCepKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFormattedTextFieldTel.requestFocus();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCepKeyPressed

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    public static void main(String args[]) {

//     try {
//         UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");   
//        }catch (Exception e) {
//        
//    }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmCadastroClientes().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxUf;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
public void listarEstados() {
        conecta.conexao();
        try {
            String sql = "SELECT * FROM  estado ";
            PreparedStatement pst = conecta.conectaBanco.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {

                jComboBoxUf.addItem(String.valueOf(resultado.getInt("id")) + " - " + resultado.getString("uf"));
//    jComboBoxUf.addItem(String.valueOf(resultado.getInt("id")));
//    resultado.getString("uf");
//    jComboBoxUf.addItem(resultado.getString("uf"));

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void listarCidades(String codigoCidade) {
        conecta.conexao();
        try {
            String sql = "SELECT * FROM cidade WHERE fk_estado = ?";

            PreparedStatement pst = conecta.conectaBanco.prepareStatement(sql);
            pst.setString(1, String.valueOf(codigoCidade));
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                jComboBoxCidade.addItem(resultado.getString("nome"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            conecta.desconecta();
        }
    }

}
