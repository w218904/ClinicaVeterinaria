/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Animal {
    private String nomeAnimal;
    private int idadeAnimal;
    private int sexoAnimal;

    public Animal(String nomeAnimal, int idadeAnimal, int sexoAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.sexoAnimal = sexoAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public int getSexoAnimal() {
        return sexoAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public void setSexoAnimal(int sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }
    
}
