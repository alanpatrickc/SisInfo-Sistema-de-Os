/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author AD
 */
public class ModelDataHora {
    private Date    data_etrada;
    private Time    hora_entrada;

    /**
     * @return the data_etrada
     */
    public Date getData_etrada() {
        return data_etrada;
    }

    /**
     * @param data_etrada the data_etrada to set
     */
    public void setData_etrada(Date data_etrada) {
        this.data_etrada = data_etrada;
    }

    /**
     * @return the hora_entrada
     */
    public Time getHora_entrada() {
        return hora_entrada;
    }

    /**
     * @param hora_entrada the hora_entrada to set
     */
    public void setHora_entrada(Time hora_entrada) {
        this.hora_entrada = hora_entrada;
    }
    
    
    
}
