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

    public Animal(int id, String nome, int idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
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