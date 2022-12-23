/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModelItensServico;
import utilitario.ConectaBanco;

/**
 *
 * @author AD
 */
public class ControllerItensServico {
    
     ConectaBanco conectaItensServico = new ConectaBanco();   
    public void salvar(ModelItensServico modelItensServico){
     conectaItensServico.conexao();
       try {
            PreparedStatement pst = conectaItensServico.conectaBanco.prepareStatement("insert into tbl_itens_servico(id,servico,quantidade,valor_unitario,valor_total)values(?,?,?,?,?)");
            pst.setInt(1,modelItensServico.getIdServico());
            pst.setString(2,modelItensServico.getServico());
            pst.setInt(3,modelItensServico.getQuantidade());
            pst.setDouble(4,modelItensServico.getValorUnitario());
            pst.setDouble(5,modelItensServico.getValorTotal());
           
            pst.executeUpdate();
            
//             preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null,"Serviço Salvo com  Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Inserção!\n ERRO: "+ex );
        

        }
    }
}
