/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova;

/**
 *
 * @author Rafael
 */
public class PrePosIncremento {
    public static void main(String args[]) {
        int a=0;
        int b=0;
        b = a++ + ++a;
        System.out.println("a1 = " + a);
        System.out.println("b1 = " + b);

        b = a++ + a++;
        System.out.println("a2 = " + a);
        System.out.println("b2 = " + b);

        b = ++a + a++;
        System.out.println("a3 = " + a);
        System.out.println("b3 = " + b);

        b = ++a + ++a;
        System.out.println("a4 = " + a);
        System.out.println("b4 = " + b);

        b = ++a + b;
        System.out.println("a5 = " + a);
        System.out.println("b5 = " + b);
    }
 
}
