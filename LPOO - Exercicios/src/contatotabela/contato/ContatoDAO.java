/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contatotabela.contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ContatoDAO{
    private String stmtAdiciona = "insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";
    private String stmtSelect = "select * from contatos";
    private String stmtAtualiza = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? WHERE id=?";
    private String stmtExcluir = "delete from contatos WHERE id=?";
    public ContatoDAO() throws SQLException {
        //this.connection = ConnectionFactory.getConnection();
        //this.stmtAdiciona = connection.prepareStatement("insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
    }

    public void adiciona(Contato contato) {
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtAdiciona, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.execute();
            //Seta o id do contato
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            long i = rs.getLong(1);
            contato.setId(i);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }

    public List<Contato> getLista() throws SQLException{
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        //PreparedStatement stmtLista = this.connection.prepareStatement("select * from contatos");
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtSelect);
            rs = stmt.executeQuery();
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
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }


    public void atualiza(Contato contato) throws SQLException{
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtAtualiza);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4,new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(5, contato.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }

    public void excluir(Contato contato) throws SQLException {
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtExcluir);

            stmt.setLong(1, contato.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }
}
