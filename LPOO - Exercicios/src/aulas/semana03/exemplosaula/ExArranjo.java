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
public class ExArranjo
{
	public static void main (String args[])
	{
		int a[] = new int[10];
		Scanner s = new Scanner (System.in);
		for (int i = 0; i < a.length; i++)
		{
			System.out.print ("Digite a[" + i + "] :");
			a[i] = s.nextInt();
		}
		System.out.println ("Valores lidos: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println ("Valor de a[" + i + "] :" + a[i]);
		}
		System.out.println ("Calculando soma...");
		int soma = 0;
		for (int elemento : a)
		{
			soma += elemento;
		}
		System.out.println ("Soma: " + soma);
	}
}
