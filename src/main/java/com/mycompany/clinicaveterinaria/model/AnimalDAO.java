package com.mycompany.clinicaveterinaria.model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author w218904
 */
public class AnimalDAO extends DAO {
    private static AnimalDAO instance;
    
    private AnimalDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static AnimalDAO getInstace() {
        return (instance == null ? (instance = new AnimalDAO()):instance);
    }
    
    //CRUD
    public Animal create(String nome, String idade, String sexo, Cliente cliente) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO animal (nome, idade, sexo, cliente) VALUES (?, ?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, idade);
            stmt.setString(3, cliente);
            executeUpdate(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.retrieveById(lasId("animal", "id"));
    }
    
    private Animal buildObject(ResultSet rs) {
        Animal animal = null;
        try {
            animal = new Animal(rs.getInt("id"), rs.getString("nome"), rs.getString("idade"), rs.getString("sexo"), rs.getString("cliente"));
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return animal;
    }
    
    //Generic Retriever
    public List retrieve (String query) {
        List<Animal> animais = new ArrayList();
        ResultSet rs = getResultSet(query);
        try {
            while (rs.next()) {
                animais.add(buildObject(rs));
            } 
        } catch (SQLException e) {
                System.out.println("Exception: " + e.getMessage());
        }
        return animais;
    }
    
}
