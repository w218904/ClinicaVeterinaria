import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDBH2 {
    public static void main(String[] args) {
        try {
            // Conectar ao banco de dados
            Connection conexao = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
            
            // Criar uma tabela
            Statement stmt = conexao.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS example (id INT, name VARCHAR(255))");
            
            // Inserir dados na tabela
            stmt.execute("INSERT INTO example (id, name) VALUES (1, 'Exemplo 1')");
            stmt.execute("INSERT INTO example (id, name) VALUES (2, 'Exemplo 2')");
            
            // Fechar a conexão
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
