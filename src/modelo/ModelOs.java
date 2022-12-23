/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author AD
 */
public class ModelOs extends ModelServico {
    private int     id_os;
    private Date    dataEntrada;
    private Time    horaEntrada;
    private String  tecResponsavel;
    private String  sitAtual;
    private String  cliente;
    private String  telefone;
    private String  equipamento;
    private String  numSerie;
    private String  modelo;
    private String  marca;
    private String  acessorios;
    private String  proInformado;
    private String  proConstatado;
    private String  obs;
    private String  formPagamento;
    private Date    dataSaida;
    private Double  valProduto;
    private Double  valDesconto;
    private Double  valTotal;
    
  
    private ArrayList<ModelServico> modelServico = new ArrayList<ModelServico>();

     public ModelOs() {
      
        modelServico = new ArrayList<ModelServico>();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      
            
     }

    /**
     * @return the id_os
     */
    public int getId_os() {
        return id_os;
    }

    /**
     * @param id_os the id_os to set
     */
    public void setId_os(int id_os) {
        this.id_os = id_os;
    }

    /**
     * @return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param data_etrada the dataEntrada to set
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the horaEntrada
     */
    public Time getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the tecResponsavel
     */
    public String getTecResponsavel() {
        return tecResponsavel;
    }

    /**
     * @param tecResponsavel the tecResponsavel to set
     */
    public void setTecResponsavel(String tecResponsavel) {
        this.tecResponsavel = tecResponsavel;
    }

    /**
     * @return the sitAtual
     */
    public String getSitAtual() {
        return sitAtual;
    }

    /**
     * @param sitAtual the sitAtual to set
     */
    public void setSitAtual(String sitAtual) {
        this.sitAtual = sitAtual;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the tipo_serv_os
     */
  

    /**
     * @return the equipamento
     */
    public String getEquipamento() {
        return equipamento;
    }

    /**
     * @param equipamento the equipamento to set
     */
    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    /**
     * @return the numSerie
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * @param numSerie the numSerie to set
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the acessorios
     */
    public String getAcessorios() {
        return acessorios;
    }

    /**
     * @param acessorios the acessorios to set
     */
    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    /**
     * @return the proInformado
     */
    public String getProInformado() {
        return proInformado;
    }

    /**
     * @param proInformado the proInformado to set
     */
    public void setProInformado(String proInformado) {
        this.proInformado = proInformado;
    }

    /**
     * @return the proConstatado
     */
    public String getProConstatado() {
        return proConstatado;
    }

    /**
     * @param proConstatado the proConstatado to set
     */
    public void setProConstatado(String proConstatado) {
        this.proConstatado = proConstatado;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the valProduto
     */
    public Double getValProduto() {
        return valProduto;
    }

    /**
     * @param valProduto the valProduto to set
     */
    public void setValProduto(Double valProduto) {
        this.valProduto = valProduto;
    }

    /**
     * @return the valDesconto
     */
    public Double getValDesconto() {
        return valDesconto;
    }

    /**
     * @param valDesconto the valDesconto to set
     */
    public void setValDesconto(Double valDesconto) {
        this.valDesconto = valDesconto;
    }

    /**
     * @return the valTotal
     */
    public Double getValTotal() {
        return valTotal;
    }

    /**
     * @param valTotal the valTotal to set
     */
    public void setValTotal(Double valTotal) {
        this.valTotal = valTotal;
    }

    /**
     * @return the modelServico
     */
    public ArrayList<ModelServico> getModelServico() {
        return modelServico;
    }

    /**
     * @param modelServico the modelServico to set
     */
    public void setModelServico(ArrayList<ModelServico> modelServico) {
        this.modelServico = modelServico;
    }

    /**
     * @return the formPagamento
     */
    public String getFormPagamento() {
        return formPagamento;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @param formPagamento the formPagamento to set
     */
    public void setFormPagamento(String formPagamento) {
        this.formPagamento = formPagamento;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
     
     
    
}
