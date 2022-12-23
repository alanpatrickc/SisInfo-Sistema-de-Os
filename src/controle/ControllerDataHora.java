/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import javax.swing.JOptionPane;
import modelo.ModelDataHora;
import utilitario.ConectaBanco;

/**
 *
 * @author AD
 */
public class ControllerDataHora {

    ConectaBanco conectaDate = new ConectaBanco();

    public void salvar(ModelDataHora modelDataHora) {
        conectaDate.conexao();
        try {
            PreparedStatement pst = conectaDate.conectaBanco.prepareStatement("insert into datetime(date,hora)values(?,?)");
            pst.setDate(1, new Date(modelDataHora.getData_etrada().getTime()));

            pst.setTime(2, new Time(modelDataHora.getHora_entrada().getTime()));

            pst.executeUpdate();

//             preencherTabela("Select * from cliente order by id_cliente");
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Inserção!\n ERRO: " + ex);

        }

    }

}
