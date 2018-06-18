/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana12.exemplos.contato;

import aulas.semana12.exemplos.ConnectionFactoryComProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ContatoDAO {
// a conexão com o banco de dados

    private Connection connection;
    private PreparedStatement stmtAdiciona;

    public ContatoDAO() throws SQLException {
        this.connection = new ConnectionFactoryComProperties().getConnection();
        this.stmtAdiciona = connection.prepareStatement("insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)");
    }



    public void adiciona(Contato contato) throws SQLException {
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
        } finally{
            stmtAdiciona.close();
        }
    }

    public List<Contato> getLista() {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
            ResultSet rs = stmt.executeQuery();
            List<Contato> contatos = new ArrayList<Contato>();
            while (rs.next()) {
                // criando o objeto Contato
                Contato contato = new Contato();
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
            rs.close();
            stmt.close();
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
