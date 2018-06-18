/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal.questao6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class ContatoDAO implements ContatoDAOInterface{
    private Connection connection;
    private PreparedStatement stmtInsert;
    private PreparedStatement stmtSelect;
    private PreparedStatement stmtUpdate;
    private PreparedStatement stmtDelete;
    public ContatoDAO() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "");
        stmtInsert = connection.prepareStatement("insert into contato (cpf,nome,sobrenome,email) values (?,?,?,?)");
        stmtSelect = connection.prepareStatement("select * from contato");
        stmtUpdate = connection.prepareStatement("update contato set cpf=?,nome=?,sobrenome=?,email=? where cpf=?");
        stmtDelete = connection.prepareStatement("delete from contato where cpf=?");
    }
    public void adiciona(Contato contato) {
         try {
              // seta os valores
            stmtInsert.setLong(1, contato.getCpf());
            stmtInsert.setString(2, contato.getNome());
            stmtInsert.setString(3, contato.getSobreNome());
            stmtInsert.setString(4, contato.getEmail());
            stmtInsert.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Contato> getLista() {
        try {
            ResultSet rs = stmtSelect.executeQuery();
            List<Contato> contatos = new ArrayList<Contato>();
            while (rs.next()) {
                // criando o objeto Contato
                Contato contato = new Contato(rs.getLong("cpf"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("email"));
                // adicionando o objeto à lista
                contatos.add(contato);
            }
            rs.close();
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualiza(Contato contato,long cpf) {
        try {
            stmtUpdate.setLong(1, contato.getCpf());
            stmtUpdate.setString(2, contato.getNome());
            stmtUpdate.setString(3, contato.getSobreNome());
            stmtUpdate.setString(4, contato.getEmail());
            stmtUpdate.setLong(5, cpf);
            stmtUpdate.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void exclui(long cpf){
        try {
            stmtDelete.setLong(1, cpf);
            stmtDelete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
