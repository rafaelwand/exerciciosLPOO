/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class JDBCExemplo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/exercicio?user=root&password=rrw@and14");
                System.out.println("Conectado!");
                Statement stmt = conexao.createStatement();
        System.out.print("Digite o nome do cliente:");
        //Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        
        String nome = sc.nextLine();
        System.out.println(nome);
        stmt.executeUpdate("INSERT INTO CLIENTE (NOME,SOBRENOME) VALUES	(\"João\",\"Silva\")");
        System.out.println("Conectado!");
        conexao.close();

        conexao.close();
    }

}
