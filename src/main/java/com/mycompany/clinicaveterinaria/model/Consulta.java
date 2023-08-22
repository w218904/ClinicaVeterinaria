/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.model;
import java.util.Date;

/**
 *
 * @author w218904
 */
public class Consulta {
    private Date dataConsulta;
    private String historico;

    public Consulta(Date dataConsulta, String historico) {
        this.dataConsulta = dataConsulta;
        this.historico = historico;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
}
