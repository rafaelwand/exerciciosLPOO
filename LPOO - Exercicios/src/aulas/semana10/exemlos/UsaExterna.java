/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana10.exemlos;

/**
 *
 * @author Rafael
 */
public class UsaExterna {

    public static void main(String args[]){
        Externa externa = new Externa(10);

        Externa.Aninhada aninhada = externa.new Aninhada();
        aninhada.exibir();
    }

}
