/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Veterinario {
    private String nomeVeterinario;
    private String endereco;
    private String telefoneVeterinario;

    public Veterinario(String nomeVeterinario, String endereco, String telefoneVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
        this.endereco = endereco;
        this.telefoneVeterinario = telefoneVeterinario;
    }

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneVeterinario() {
        return telefoneVeterinario;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefoneVeterinario(String telefoneVeterinario) {
        this.telefoneVeterinario = telefoneVeterinario;
    }
    
    
    
}
