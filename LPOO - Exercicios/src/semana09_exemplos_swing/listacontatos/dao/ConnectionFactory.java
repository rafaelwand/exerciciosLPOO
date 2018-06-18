package semana09_exemplos_swing.listacontatos.dao;

//import posjava.semana07_jdbc.exemplos.livroautor.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
