package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Animal {
    private int id;
    private String nome;
    private int dataNasc;
    private String sexo;
    private int idEspecie;
    private int idCliente;

    public Animal(int id, String nome, int dataNasc, String sexo, int idEspecie, int idCliente) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.idEspecie = idEspecie;
        this.idCliente = idCliente;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public String getSexo() {
        return sexo;
    }
    
    public int getIdEspecie() {
        return idEspecie;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(int idade) {
        this.dataNasc = dataNasc;
    }

    public void setSexoAnimal(String sexo) {
        this.sexo = sexo;
    }
}