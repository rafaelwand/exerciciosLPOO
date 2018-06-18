/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ExMatriz
{
	public static void main (String args[])
	{
		//declara e aloca matriz 3 x 4
		double m[][] = new double [3][4];
		//preenche matriz
		for (int l = 0; l < m.length; l++)
			for (int c = 0; c < m[l].length; c++)
			{
				m[l][c] = l * m[l].length + c;
			}
		//exibe matriz
		for (int l = 0; l < m.length; l++)
		{
			for (int c = 0; c < m[l].length; c++)
			{
				System.out.print (m[l][c] + "\t");
			}
			System.out.println ();
		}
	}
}

