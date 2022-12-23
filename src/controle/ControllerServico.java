/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.ModelServico;
import utilitario.ConectaBanco;

/**
 *
 * @author AD
 */
public class ControllerServico {
    ConectaBanco conectaServico = new ConectaBanco();   
    public void salvar(ModelServico modelServico){
     conectaServico.conexao();
       try {
            PreparedStatement pst = conectaServico.conectaBanco.prepareStatement("insert into tbl_servico(servico,quantidade,valorunitario,valortotal)values(?,?,?,?)");
            pst.setString(1,modelServico.getServico());
            pst.setInt(2,modelServico.getQuantidade());
            pst.setString(3,modelServico.getValorUnitario());
            pst.setString(4,modelServico.getValorTotal());
           
            pst.executeUpdate();
            
//             preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Inserção!\n ERRO: "+ex );
        

        }
   }
   public void excluir(ModelServico modelServico){
         
   
      conectaServico.conexao();
       try {
            PreparedStatement pst = conectaServico.conectaBanco.prepareStatement("delete   from tbl_servico where id = ? " );
            
            pst.setInt(1,modelServico.getId());

           
            pst.executeUpdate();
            

            
//            preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Exclusão!\n ERRO: "+ex );
        

        }
   }
   
  
   public void alterar(ModelServico modelServico){
       conectaServico.conexao();
       try {
            PreparedStatement pst = conectaServico.conectaBanco.prepareStatement("UPDATE  tbl_servico SET servico = ?,quantidade= ?,valorunitario= ?,valortotal=? where id =?");
            pst.setString(1,modelServico.getServico());
            pst.setInt(2,modelServico.getQuantidade());
            pst.setString(3,modelServico.getValorUnitario());
            pst.setString(4,modelServico.getValorTotal());
            pst.setInt(5,modelServico.getId());
            pst.executeUpdate();
            
//             preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null,"Aterarado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar!\n ERRO: "+ex );
        

        }
   conectaServico.desconecta();
}

    public static List<ModelServico> listar(String servico)
        throws SQLException, Exception {
        
        String sql = "SELECT  id, servico, quantidade,valorunitario, valortotal, dataNascimento, "
               
                + "FROM DBOS.tbl_servico";
        List<ModelServico> listaServico = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try{
            ConectaBanco conectaBanco = new ConectaBanco();
            conectaBanco.conexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaServico == null) {
                    listaServico = new ArrayList<ModelServico>();
                }
                ModelServico modelServico = new ModelServico();
                modelServico.setId(result.getInt("id"));
                modelServico.setServico(result.getString("servico"));
                modelServico.setQuantidade(result.getInt("quantidade"));
                modelServico.setValorUnitario(result.getString("valorunitario"));
                modelServico.setValorTotal(result.getString("valortotal"));
               
                
                listaServico.add(modelServico);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaServico;

}
    public static List<ModelServico> procurar(String servico)
        throws SQLException, Exception {
        
        String sql = "SELECT id, servico, quantidade,valorunitario, valortotal "
                + "FROM DBOS.tbl_servicos WHERE servico LIKE (?)";
        List<ModelServico> listaServicos = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;        
        
        try{
            ConectaBanco conectaBanco = new ConectaBanco();
            conectaBanco.conexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "%" + servico + "%");
            
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaServicos == null) {
                    listaServicos = new ArrayList<ModelServico>();
                }
                ModelServico modelServico = new ModelServico();
                modelServico.setId(result.getInt("id"));
                modelServico.setServico(result.getString("servico"));
                modelServico.setQuantidade(result.getInt("quantidade"));
                modelServico.setValorUnitario(result.getString("valorunitario"));
                modelServico.setValorTotal(result.getString("valortotal"));
                
                listaServicos.add(modelServico);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaServicos;
    }
    //PROCURAR/LISTAR
    
}