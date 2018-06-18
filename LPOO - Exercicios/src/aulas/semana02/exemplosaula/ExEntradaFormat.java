package aulas.semana02.exemplosaula;

//Importa��o da classe Scanner do pacote java.util
import java.util.Scanner;

public class ExEntradaFormat
{
	public static void main (String args[])
	{
		System.out.println ("Olá!"); //Mensagem inicial

		//Exibe mensagem e prepara entrada de dados
		System.out.println ("Digite um inteiro: ");
		Scanner s = new Scanner (System.in);
		int valor = s.nextInt(); //declara e atribui valor � vari�vel

		//exibi��o do valor lido
		System.out.println ("Valor digitado = " + valor);
	}
}
