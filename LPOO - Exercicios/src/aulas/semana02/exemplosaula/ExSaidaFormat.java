package aulas.semana02.exemplosaula;

import java.util.Scanner;

public class ExSaidaFormat
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("Digite um n�mero: ");
		double numero = sc.nextDouble();
		System.out.printf ("Sa�da com uma casa decimal: %.1f", numero);
	}
}
