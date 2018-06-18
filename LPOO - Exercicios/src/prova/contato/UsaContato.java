/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prova.contato;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class UsaContato {
    public static void main(String args[]) throws SQLException{
        ContatoDAO contatoDAO = new ContatoDAO();

        List<Contato> listaContatos = contatoDAO.getListaPorSobrenome("Wandresen");

 //       contatoDAO.excluiContato("rafaelwand@gmail.com");

  
        for(Contato contato : listaContatos){
            System.out.println("Nome="+contato.getNome());
            System.out.println("SobreNome="+contato.getSobreNome());
            System.out.println("email="+contato.getEmail());
        }

    }
}
