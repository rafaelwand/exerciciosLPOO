/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana12.exemplos;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class JDBCExemplo2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conexao = new ConnectionFactoryComProperties().getConnection();
        java.sql.Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE WHERE SOBRENOME=\"Wandresen\"");
        while(rs.next()){
            System.out.println("------");
            System.out.println(rs.getString("nome"));
            System.out.println(rs.getString(2));
        }
        System.out.println("------");
        System.out.println("Fim Lista!");

        conexao.close();
    }
}
