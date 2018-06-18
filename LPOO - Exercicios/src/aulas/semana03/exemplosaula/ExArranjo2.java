/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ExArranjo2
{
	public static void main (String args[])
	{
		String arranjo[] = {"Ola", "turma", "da", "aula", "de", "Java", "!"};

		int tamanho = arranjo.length;
		for (int i = 0; i < tamanho; i++) {
			System.out.print (arranjo[i] + " ");
		}
                System.out.print("\n");

		for (String elemento: arranjo) {
			 System.out.print (elemento + " ");
		}
	}
}

