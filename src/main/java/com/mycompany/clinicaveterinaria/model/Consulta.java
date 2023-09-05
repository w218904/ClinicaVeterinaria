package com.mycompany.clinicaveterinaria.model;

import java.util.Date;

/**
 *
 * @author w218904
 */
public class Consulta {
    private int id;
    private Date dataConsulta;
    private String historico;

    public Consulta(int id, Date dataConsulta, String historico) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.historico = historico;
    }
    
    public int getId() {
        return id;
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
