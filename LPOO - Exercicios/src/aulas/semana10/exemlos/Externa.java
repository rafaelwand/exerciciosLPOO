/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana10.exemlos;

/**
 *
 * @author Rafael
 */
public class Externa {
    private int valor;
    public Externa(int valor) { this.valor = valor; }

    public class Aninhada {
        public void exibir() {
            System.out.println("valor = "+ valor);
        }
    }
}

