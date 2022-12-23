/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @Alan Rodrigues
 */
public class ConectaBanco {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5433/DBOS";
    private String usuario= "postgres";
    private String senha = "admin";
    public Connection conectaBanco;
    
    public void conexao() {
     
          try {
            System.setProperty("jdbc.Drivers", driver);  
            conectaBanco = DriverManager.getConnection(caminho, usuario, senha);
              //JOptionPane.showMessageDialog(null, "conectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro de conexão");
        }
    }
    public void desconecta(){
       
        try {
            conectaBanco.close();
//            JOptionPane.showMessageDialog(null, "desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar a conexão");
            
        }
    
    }

    public void executaSQL(String SQL) 
    {
        
        try {
            stm = conectaBanco.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           
            rs = stm.executeQuery(SQL);
        } 
        
            catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}