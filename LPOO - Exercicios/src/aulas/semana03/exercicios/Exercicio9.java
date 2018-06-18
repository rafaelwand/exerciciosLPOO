/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exercicios;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercicio9 {
    public static void main(String args[]){
        double m[][] = new double [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a[1][1]");
        m[0][0]=sc.nextDouble();
        System.out.println("Entre com a[1][2]");
        m[0][1]=sc.nextDouble();
        System.out.println("Entre com a[1][3]");
        m[0][2]=sc.nextDouble();
        System.out.println("Entre com a[2][1]");
        m[1][0]=sc.nextDouble();
        System.out.println("Entre com a[2][2]");
        m[1][1]=sc.nextDouble();
        System.out.println("Entre com a[2][3]");
        m[1][2]=sc.nextDouble();
        System.out.println("Entre com a[3][1]");
        m[2][0]=sc.nextDouble();
        System.out.println("Entre com a[3][2]");
        m[2][1]=sc.nextDouble();
        System.out.println("Entre com a[3][3]");
        m[2][2]=sc.nextDouble();

        double determinante = m[0][0]*m[1][1]*m[2][2]+m[1][0]*m[2][1]*m[0][2]+m[2][0]*m[0][1]*m[1][2]
                             -m[2][0]*m[1][1]*m[0][2]-m[2][1]*m[1][2]*m[0][0]-m[2][2]*m[1][0]*m[0][1];

        System.out.println("Determinante="+determinante);
    }
}
