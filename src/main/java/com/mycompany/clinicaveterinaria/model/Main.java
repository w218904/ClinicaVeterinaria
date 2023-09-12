/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Main {
    
    public static void main(String args[]) {
        
        AnimalDAO.getInstace().create("Toto", 1999, "Macho", 1, 1);
        
        System.out.println("Começa aqui: \n");
        System.out.println(AnimalDAO.getInstace().retrieveById(1));
        
    }
    
}
