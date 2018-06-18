/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal.questao6;

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
        contatoDAO.exclui(1);
        contatoDAO.exclui(3);
        Contato contato1 = new Contato(1,"Rafael","Wandresen","rafaelwand@gmail.com");
        Contato contato2 = new Contato(2,"Viviane","Wolski","vanefatima@gmail.com");
        Contato contato3 = new Contato(3,"João","Wandresen","vanefatima@gmail.com");

        contatoDAO.adiciona(contato1);
        contatoDAO.adiciona(contato2);
        contatoDAO.adiciona(contato3);

        contato3.setEmail("joao@gmail.com");
        contatoDAO.atualiza(contato3, 3);

        //contatoDAO.exclui(2);

        List<Contato> listaContatos = contatoDAO.getLista();


        for(Contato contato : listaContatos){
            System.out.println("Nome="+contato.getNome());
            System.out.println("SobreNome="+contato.getSobreNome());
            System.out.println("email="+contato.getEmail());
        }

    }
}
