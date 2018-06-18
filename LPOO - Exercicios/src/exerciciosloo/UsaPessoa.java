/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo;

/**
 *
 * @author Rafael
 */
public class UsaPessoa {

    public static void main(String args[]) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Joao");
        Pessoa p2 = p1;
        Pessoa p3 = p1.retornaClone();
        p2.setNome("Maria");
        System.out.println("P1=" + p1.getNome());
        System.out.println("P2=" + p2.getNome());
        System.out.println("P3=" + p3.getNome());
    }
}
