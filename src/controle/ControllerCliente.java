/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitario.ConectaBanco;
import modelo.ModelCliente;

/**
 *
 * @author Serva Vitoriosa
 */
public class ControllerCliente {

    ConectaBanco conectaCliente = new ConectaBanco();

    public void salvar(ModelCliente modeloCliente) {
        conectaCliente.conexao();
        try {
            PreparedStatement pst = conectaCliente.conectaBanco.prepareStatement("insert into cliente(nome_cliente,cpf_cliente,end_cliente,cid_cliente,bairro_cli,cep_cli,tel_cli,uf)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, modeloCliente.getNome());
            pst.setString(2, modeloCliente.getCpf());
            pst.setString(3, modeloCliente.getEndereço());
            pst.setString(4, (String) modeloCliente.getCidade());
            pst.setString(5, modeloCliente.getBairro());
            pst.setString(6, modeloCliente.getCep());
            pst.setString(7, modeloCliente.getTelefone());
            pst.setString(8, (String) modeloCliente.getUf_cliente());

            pst.executeUpdate();

//             preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Inserção!\n ERRO: " + ex);

        }
    }

    public void excluir(ModelCliente modeloCliente) {

        conectaCliente.conexao();
        try {
            PreparedStatement pst = conectaCliente.conectaBanco.prepareStatement("delete   from cliente where id_cliente = ? ");

            pst.setInt(1, modeloCliente.getCodigo());

            pst.executeUpdate();

//            preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão!\n ERRO: " + ex);

        }
    }

    public void alterar(ModelCliente modeloCliente) {
        conectaCliente.conexao();
        try {
            PreparedStatement pst = conectaCliente.conectaBanco.prepareStatement("UPDATE  cliente SET nome_cliente = ?,cpf_cliente = ?,end_cliente = ?,cid_cliente=?,bairro_cli=?,cep_cli=?,tel_cli=?,uf = ? where id_cliente=?");
            pst.setString(1, modeloCliente.getNome());
            pst.setString(2, modeloCliente.getCpf());
            pst.setString(3, modeloCliente.getEndereço());
            pst.setString(4, (String) modeloCliente.getCidade());
            pst.setString(5, modeloCliente.getBairro());
            pst.setString(6, modeloCliente.getCep());
            pst.setString(7, modeloCliente.getTelefone());
            pst.setString(8, (String) modeloCliente.getUf_cliente());
            pst.setInt(9, modeloCliente.getCodigo());
            pst.executeUpdate();

//             preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null, "Aterarado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!\n ERRO: " + ex);

        }
        conectaCliente.desconecta();
    }

}
