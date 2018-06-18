/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Fibonacci {
    public static void main(String[] arg){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o valor: ");
            int a = sc.nextInt();
            if (a < 1) {
                throw new Exception("Valor é um inteiro, porém não é positivo.");
            }
            int fibonacci=1;int aux;
            int ultimo=0;
            System.out.print("Saída:0");
            while(fibonacci<a){
                aux=fibonacci;
                System.out.println(fibonacci);
                fibonacci+=ultimo;
                ultimo=aux;
            }System.out.print(fibonacci);
            /*
            while (d > c) {
                a = b;
                b = c;
                c = a + b;
                System.out.print(c);

            }*/
        } catch (InputMismatchException ex) {
            System.out.println("Valor de entrada não é um inteiro positivo.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
