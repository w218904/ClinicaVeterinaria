package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String cep;
    private String email;
    private String telefone;

    public Cliente(int id, String nome, String endereco, String cep, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = cep;
        this.cep = email;
        this.email = telefone;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEmail(String email){
        if(!email.equals("")){
            this.email = email;
        }
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {        
        String desc = "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", cep=" + cep + ", email=" + email + ", telefone=" + telefone + '}';
        return desc;
    } 
    
}