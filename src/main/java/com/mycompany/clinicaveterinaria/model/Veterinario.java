package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Veterinario {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Veterinario(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefoneVeterinario(String telefone) {
        this.telefone = telefone;
    }

}
