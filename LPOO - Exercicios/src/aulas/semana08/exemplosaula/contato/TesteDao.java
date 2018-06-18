/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana08.exemplosaula.contato;

import java.sql.SQLException;
import java.util.Calendar;
public class TesteDao {
    public static void main(String[] args) throws SQLException {
        // pronto para gravar
        Contato contato = new Contato();
        contato.setNome("Gustavo");
        contato.setEmail("gustavo@gmail.com");
        contato.setEndereco("R. Inventada n. 20");
        contato.setDataNascimento(Calendar.getInstance());
        // grave nessa conexão!!!
        ContatoDAO dao = new ContatoDAO();
        // método elegante
        dao.adiciona(contato);
        System.out.println("Gravado!");
    }
}
