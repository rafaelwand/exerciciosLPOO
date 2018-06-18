/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal.questao6;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface ContatoDAOInterface {
    public void adiciona(Contato contato);
    public List<Contato> getLista();
    public void atualiza(Contato contato,long cpf);
    public void exclui(long cpf);
}
