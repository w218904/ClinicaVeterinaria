/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import com.mycompany.clinicaveterinaria.model.Cliente;
/**
 *
 * @author w218904
 */
public class ClinicaVeterinaria {

    public static void main(String[] args) {
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conexaoSQLite);
        
        criarBancoSQLite.criarTabelaCliente();
        
        Cliente cliente =  new Cliente("Wara", "Limeira", "19982757007", 12345678, "waarapardo@gmail.com");
    }
}