/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana07.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ImplementaEvento implements Evento{

    @Override
    public void clicar() {
        System.out.println("Clicou ImplementaEvento!");
    }

    @Override
    public void arrastar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
