package aulas.semana02.exemplosaula;

import java.util.Scanner;
public class OperadorTernario{

	public static void main(String[] args){
		System.out.println("Insira um valor numerico:");
		Scanner s = new Scanner (System.in);
		double valor = s.nextDouble(); //declara e atribui valor � vari�vel
		System.out.printf("O valor %.1f " + (valor>=50 ? "eh maior/igual que 50" : "menor que 50"),valor);
	}

}