package aulas.semana12.exemplos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCExemploComConnectionFactory1 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = new ConnectionFactoryComProperties().getConnection();
        System.out.println("Conectado!");
        conexao.close();
    }
}
