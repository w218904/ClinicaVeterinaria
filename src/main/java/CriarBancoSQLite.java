
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author w218904
 */
public class CriarBancoSQLite {
    
    private final ConexaoSQLite conexaoSQLite;
    
    public CriarBancoSQLite(ConexaoSQLite pConexaoSQLite) {
        this.conexaoSQLite = pConexaoSQLite;
    }
    
    public void criarTabelaCliente() {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_clientes"
                + "("
                + "id integer PRIMARY KEY,"
                + "nome text NOT NULL,"
                + "endereco text,"
                + "telefoneCliente text,"
                + "cepCliente long,"
                + "emailCliente text"
                +")";
        
        boolean conectou = false;
        
        try {
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            
            stmt.execute(sql);
            
            System.out.println("Tabela cliente criada");
            
        } catch(SQLException e) {
            //mensagem de erro na criação da tabela
        } finally {
            if(conectou) {
                this.conexaoSQLite.desconectar();
            }
        }
    }
    
}
