/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ExemploDoWhile2
{
	public static void main (String args[])
	{
		int min = Integer.parseInt (args[0]);
		int max = Integer.parseInt (args[1]);
		do {
			System.out.println (min + "<" + max);
			min++; max--;
		} while (min < max);
		 System.out.println (min + "<" + max + ": Condição inválida!");
	}
}

