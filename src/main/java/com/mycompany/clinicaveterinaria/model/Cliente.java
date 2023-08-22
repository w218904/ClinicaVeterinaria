/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Cliente {
    private String nomeCliente;
    private String endereco;
    private String telefoneCliente;
    private long cepCliente;
    private String emailCliente;

    public Cliente(String nomeCliente, String endereco, String telefoneCliente, long cepCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.telefoneCliente = telefoneCliente;
        this.cepCliente = cepCliente;
        this.emailCliente = emailCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public long getCepCliente() {
        return cepCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public void setCepCliente(long cepCliente) {
        this.cepCliente = cepCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
}
