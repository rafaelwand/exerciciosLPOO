/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prova.contato;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface ContatoDAOInterface {
    public void excluiContato(String email);
    public List<Contato> getListaPorSobrenome(String sobreNome);
}
