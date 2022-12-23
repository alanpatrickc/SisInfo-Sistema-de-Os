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
import modelo.ModelOs;
import utilitario.ConectaBanco;

/**
 *
 * @author AD
 */
public class ControllerOs {

    ConectaBanco conectaOs = new ConectaBanco();

    public void salvarOs(ModelOs modelOs) {

        conectaOs.conexao();

        try {
            PreparedStatement pst = conectaOs.conectaBanco.prepareStatement("insert into tbl_os("
                    + "data_entrada,"
                    + "hora_entrada,"
                    + "tec_responsavel,"
                    + "sit_atual,"
                    + "cliente,"
                    + "telefone,"
                    + "equipamento,"
                    + "num_serie,"
                    + "modelo,"
                    + "marca,"
                    + "acessorios,"
                    + "pro_informado,"
                    + "pro_constatado,"
                    + "obs,"
                    + "form_pag,"
                    + "data_saida,"
                    + "val_produto,"
                    + "desc_produto,"
                    + "val_total)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//          pst.setInt(1,modelOs.getId_os());
            pst.setDate(1, new Date(modelOs.getDataEntrada().getTime()));
            pst.setTime(2, new Time(modelOs.getHoraEntrada().getTime()));
            pst.setString(3, (String) modelOs.getTecResponsavel());
            pst.setString(4, (String) modelOs.getSitAtual());
            pst.setString(5, modelOs.getCliente());
            pst.setString(6, modelOs.getTelefone());
            pst.setString(7, modelOs.getEquipamento());
            pst.setString(8, modelOs.getNumSerie());
            pst.setString(9, modelOs.getModelo());
            pst.setString(10, modelOs.getMarca());
            pst.setString(11, modelOs.getAcessorios());
            pst.setString(12, modelOs.getProInformado());
            pst.setString(13, modelOs.getProConstatado());
            pst.setString(14, modelOs.getObs());
            pst.setString(15, modelOs.getFormPagamento());
            pst.setDate(16, new Date(modelOs.getDataSaida().getTime()));
            pst.setDouble(17, modelOs.getValProduto());
            pst.setDouble(18, modelOs.getValDesconto());
            pst.setDouble(19, modelOs.getValTotal());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Inserção!\n ERRO: " + ex);

        }        // TODO add your 
    }

}
