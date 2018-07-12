/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.contato.model.dao;

import org.ufpr.contato.model.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.ufpr.contato.model.Contato;

/**
 *
 * @author Rafael
 */
public class ContatoDAO{
// a conexão com o banco de dados

    private Connection connection;
    private PreparedStatement stmtAdiciona;

    public ContatoDAO() throws SQLException {
        //this.connection = DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "");
        this.connection = ConnectionFactory.getConnection();
        this.stmtAdiciona = connection.prepareStatement("insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
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
            stmtAdiciona.setDate(4, Date.valueOf(contato.getDataNascimento()));
            // executa
            stmtAdiciona.execute();
            //Seta o id do contato
            ResultSet rs = stmtAdiciona.getGeneratedKeys();
            rs.next();
            long i = rs.getLong(1);
            contato.setId(i);
            
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
                //Contato contato = new Contato();
                long id = rs.getLong("id");
                String nome= rs.getString("nome");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                LocalDate dataNascimento = rs.getDate("dataNascimento").toLocalDate();
                
                // adicionando o objeto à lista
                contatos.add(new Contato(id,nome,email,endereco,dataNascimento));
            }
            
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            rs.close();
            stmtLista.close();
        }

    }


    public void atualiza(Contato contato) throws SQLException{
        PreparedStatement stmtAtualiza = this.connection.prepareStatement("update contatos set nome=?, email=?, endereco=?, dataNascimento=? WHERE id=?;");
        try {
            stmtAtualiza.setString(1, contato.getNome());
            stmtAtualiza.setString(2, contato.getEmail());
            stmtAtualiza.setString(3, contato.getEndereco());
            stmtAtualiza.setDate(4,Date.valueOf(contato.getDataNascimento()));
            stmtAtualiza.setLong(5, contato.getId());
            stmtAtualiza.executeUpdate();
        } finally{
            stmtAtualiza.close();
        }

    }

    public void excluir(Contato contato) throws SQLException {
        PreparedStatement stmtExcluir = this.connection.prepareStatement("delete from contatos WHERE id=?;");
        try {
            stmtExcluir.setLong(1, contato.getId());
            stmtExcluir.executeUpdate();
        } finally{
            stmtExcluir.close();
        }

    }
}
