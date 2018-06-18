/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class ExContinue
{
	public static void main (String args[])
	{
            System.out.println("Insira numero máximo de iterações:");
            Scanner sc = new Scanner(System.in);
            int iteracoes = sc.nextInt();
		for (int i = 0; i <= iteracoes; i++)
		{
			//abrevia a iteracao se i for multiplo de 2, 3 ou 5
			if (i%2==0 || i%3==0 || i%5 == 0){
				continue;
                        }
                        //if(i>iteracoes){
                         //   break;
                        //}
			//processamento normal para os demais casos
			System.out.println ("i = " + i);
		}
	}
}

