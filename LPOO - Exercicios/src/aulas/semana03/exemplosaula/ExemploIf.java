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
public class ExemploIf
{
	public static void main (String args[])
	{
		String strNome, strMensagem;
		int iIdade;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Digite o nome: ");
		strNome = sc.next();
		System.out.println ("Digite a idade: ");
		iIdade = sc.nextInt();
		strMensagem = "";

		if (iIdade < 16)
			strMensagem = "Nao vota";
		else
			if ((iIdade == 16) || (iIdade == 17) || (iIdade > 70))
				strMensagem = "Voto facultativo";
			else
				strMensagem = "Voto obrigatorio";

		System.out.println (strMensagem);
	}
}

