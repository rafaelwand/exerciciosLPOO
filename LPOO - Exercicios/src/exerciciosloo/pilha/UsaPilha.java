/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.pilha;

import aulas.semana10.exercicios.Pilha;

/**
 *
 * @author Rafael
 */
public class UsaPilha {
    
    public static void main(String[] args) throws Exception{
        Pilha <Integer> p1 = new Pilha <Integer>();
        p1.empilha(5);
        p1.empilha(4);
        p1.empilha(3);
        System.out.println(p1.toString());
        System.out.println(p1.desempilha());
        p1.empilha(10);
        System.out.println(p1.toString());

        Pilha <String> p2 = new Pilha <String>();
        p2.empilha("String 1");
        p2.empilha("String 2");
        p2.empilha("String 3");

        System.out.println(p2.toString());
        p2.desempilha();
        System.out.println(p2.toString());

    }

}
