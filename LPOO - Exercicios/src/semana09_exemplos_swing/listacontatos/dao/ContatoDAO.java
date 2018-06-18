/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09_exemplos_swing.listacontatos.dao;

import semana09_exemplos_swing.listacontatos.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ContatoDAO{
// a conexão com o banco de dados

    private Connection connection;
    private PreparedStatement stmtAdiciona;

    public ContatoDAO() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "");
        this.connection = ConnectionFactory.getConnection();
        this.stmtAdiciona = connection.prepareStatement("insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)");
    }

    public void adiciona(Contato contato) {
        //String sql = "insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";
        try {
            // prepared statement para inserção
            //PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmtAdiciona.setString(1, contato.getNome());
            stmtAdiciona.setString(2, contato.getEmail());
            stmtAdiciona.setString(3, contato.getEndereco());
            stmtAdiciona.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            // executa
            stmtAdiciona.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }

    public List<Contato> getLista() throws SQLException{
        ResultSet rs = null;
        PreparedStatement stmtLista = this.connection.prepareStatement("select * from contatos");
        try {
            rs = stmtLista.executeQuery();
            List<Contato> contatos = new ArrayList();
            while (rs.next()) {
                // criando o objeto Contato
                Contato contato = new Contato();
                contato.setId(rs.getLong("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                contato.setDataNascimento(data);
                // adicionando o objeto à lista
                contatos.add(contato);
            }
            
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            rs.close();
            stmtLista.close();
        }

    }
}
