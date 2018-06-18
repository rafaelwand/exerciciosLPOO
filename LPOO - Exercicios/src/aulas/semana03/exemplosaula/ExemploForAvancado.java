/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ExemploForAvancado
{
	public static void main (String args[])
	{
		double arranjo[] = {1.1964, 6.1995, 7.1931, 12.1968};

		//for tradicional para exibição
		int tamanho = arranjo.length;
		for (int i = 0; i < tamanho; i++) {
			System.out.println (arranjo[i] + " ");
		}

		//for avançado para exibição
		for (double elemento: arranjo) {
			 System.out.println (elemento + " ");
		}	
	}
}

