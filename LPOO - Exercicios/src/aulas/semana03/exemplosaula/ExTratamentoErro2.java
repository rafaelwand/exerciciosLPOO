/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
import java.util.*;
public class ExTratamentoErro2
{
	public static void main (String args[])
	{
		int i; double d, soma;
		Scanner s = new Scanner (System.in);
		try {
			System.out.println ("Digite um inteiro: ");
			i = s.nextInt();
			System.out.println ("Digite um real: ");
			d = s.nextDouble();
			soma = i + d;
			System.out.printf ("Resultado: %.3f", soma);
		}
		catch (InputMismatchException ime)
		{
			System.out.println ("*****************************************");
			System.out.println ("Ocorreu um erro na leitura da informacao!");
			System.out.println ("Mensagem da JVM: " + ime.toString());
			System.out.println ("Stack trace: " );
			ime.printStackTrace();
		}
	}
}

