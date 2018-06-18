
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class ExSaidaFormat {
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("No final? ");
		int limite = sc.nextInt();
		int soma = 0;
		for (int i=1 ; i<=limite ; i++)
		{
			System.out.printf ("%3da. soma parcial = %6d%n", i, soma);
			soma = soma + i;
		}
		System.out.printf ("Soma total[0..%3d] = %6d%n", limite, soma);
	}

}
