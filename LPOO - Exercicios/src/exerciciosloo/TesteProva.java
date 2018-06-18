/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class TesteProva {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int t = l.nextInt();
        int a[] = new int[t];
        for (int i=0;i<a.length;i++)
            a[i]=l.nextInt();
//        for(int elemento:a)
//            elemento=l.nextInt();
        for (int elemento : a)
            System.out.println(elemento);

    }
}

