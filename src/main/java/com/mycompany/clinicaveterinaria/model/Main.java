package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author w218904
 */
public class Main {
    
    public static void main(String args[]) {
        
        AnimalDAO.getInstace().create("a", 1, "a", 1, 1);
        
        System.out.println("Começa aqui:\n");
        System.out.println("Começa aqui: " + AnimalDAO.getInstace().retrieveAll() + " ...termina aqui");
        
    }
    
}