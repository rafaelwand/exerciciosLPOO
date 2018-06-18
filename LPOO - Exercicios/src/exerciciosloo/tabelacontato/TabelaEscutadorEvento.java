/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.tabelacontato;

import exerciciosloo.tabelacontato.contato.Contato;
import exerciciosloo.tabelacontato.contato.ContatoDAO;
import java.sql.SQLException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Rafael
 */
public class TabelaEscutadorEvento implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {
        try {
            if(e.getType()==0){
                int linhaAlterada = e.getFirstRow();
                ModeloTabelaContatos modelo = (ModeloTabelaContatos) e.getSource();
                Contato contato = modelo.getContato(linhaAlterada);
                ContatoDAO dao = new ContatoDAO();
                dao.atualiza(contato);
            }else if(e.getType()==1){
                int linhaIncluida = e.getFirstRow();
                ModeloTabelaContatos modelo = (ModeloTabelaContatos) e.getSource();
                Contato contato = modelo.getContato(linhaIncluida);
                ContatoDAO dao = new ContatoDAO();
                dao.adiciona(contato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
