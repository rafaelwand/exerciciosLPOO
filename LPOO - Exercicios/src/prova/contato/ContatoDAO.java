/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prova.contato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Rafael
 */
public class ContatoDAO implements ContatoDAOInterface{
    private Connection connection;
    private PreparedStatement stmtSelect;
    private PreparedStatement stmtDelete;
    public ContatoDAO() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "");
        stmtSelect = connection.prepareStatement("select * from contato where sobrenome=?");
        stmtDelete = connection.prepareStatement("delete from contato where email=?");
    }


    @Override
    public void excluiContato(String email) {
        try {
            stmtDelete.setString(1, email);
            stmtDelete.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir contato. Erro: "+ex.getMessage());
        }
    }

    @Override
    public List<Contato> getListaPorSobrenome(String sobreNome) {
        List<Contato> contatos = new ArrayList();
        try {
            stmtSelect.setString(1, sobreNome);
            ResultSet rs = stmtSelect.executeQuery();
            while (rs.next()) {
                // criando o objeto Contato
                Contato contato = new Contato(rs.getLong("cpf"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("email"));
                // adicionando o objeto à lista
                contatos.add(contato);
            }
            rs.close();
           
        } catch (SQLException e) {
            System.out.println("Erro ao listar contatos pelo sobrenome. Erro: "+e.getMessage());
        }
         return contatos;
    }



}
