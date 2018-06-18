package aulas.semana11.exemplos.contatotabela.contato;

//import posjava.semana07_jdbc.exemplos.livroautor.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "rrw@and14");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
