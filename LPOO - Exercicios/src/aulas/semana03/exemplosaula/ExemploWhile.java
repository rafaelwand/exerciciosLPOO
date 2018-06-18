/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ExemploWhile
{
	public static void main (String args[])
	{
		int j = Integer.parseInt (args[0]);
		while (j >= 0) {
			System.out.println (j);
			j--;
		}
	}
}
