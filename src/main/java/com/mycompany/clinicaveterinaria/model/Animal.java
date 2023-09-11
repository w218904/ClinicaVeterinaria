package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Animal {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private Cliente cliente;

    public Animal(int id, String nome, int idade, String sexo, Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cliente = cliente;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    
    public Cliente getIdCliente() {
        return cliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdadeAnimal(int idade) {
        this.idade = idade;
    }

    public void setSexoAnimal(String sexo) {
        this.sexo = sexo;
    }
}