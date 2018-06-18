/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
import java.util.Scanner;
public class ExBreak
{
	public static void main (String args[])
	{
		int pares = 0; //variavel para indicar numero de pares encontrados
		int max = 0; //variavel para indicar numero maximo de pares
		System.out.println ("Maximo de pares? ");
		Scanner s = new Scanner (System.in);
		max = s.nextInt();
		for (int i = 0; i < 1000; i++)
		{
			System.out.println ("i = " + i);
			if (i%2 == 0)
				pares++;
			if (pares == max)
				break;
		}
	}
}

