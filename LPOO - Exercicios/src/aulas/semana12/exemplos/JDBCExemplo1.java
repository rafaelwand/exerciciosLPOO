/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana12.exemplos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rafael
 */
public class JDBCExemplo1 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = new ConnectionFactoryComProperties().getConnection();
        Statement stmt = conexao.createStatement();
        stmt.executeUpdate("INSERT INTO CLIENTE (NOME,SOBRENOME) VALUES(\"Renato\",\"Wandresen\")");
        System.out.println("Conectado!");
        conexao.close();
    }
}
