/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
import java.io.*;

public class ExTratamentoErro3
{
	public static void main (String args[])
	{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		try
		{
			String strDado;
			System.out.println ("Dado de entrada: ");
			strDado = reader.readLine();
			System.out.println ("Dado lido : " + strDado);
			String palavras[] = strDado.split("\\s");
			for (int i = 0; i < palavras.length; i++)
				System.out.printf ("%3da. palavra: %s\n", i+1, palavras[i]);
		}
		catch (IOException ioe)
		{
			System.out.println ("Erro na leitura dos dados.");
		}
	}
}

