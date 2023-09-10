package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Exame {
    private int id;
    private String descricaoExame;

    public Exame(int id, String descricaoExame) {
        this.id = id;
        this.descricaoExame = descricaoExame;
    }

    public int getId() {
        return id;
    }
    
    public String getDescricaoExame() {
        return descricaoExame;
    }

    public void setDescricaoExame(String descricaoExame) {
        this.descricaoExame = descricaoExame;
    }
    
}
