package aulas.semana03.exemplosaula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTratamentoErro {

    public static void main(String args[]) {
        String entrada1="";
        String entrada2="";
        try {
            int i;
            double d, soma;
            Scanner s = new Scanner(System.in);

            System.out.println("Digite um inteiro: ");
            entrada1 = s.next();
            System.out.println("Digite um real: ");
            entrada2 = s.next();
            i = Integer.parseInt(entrada1);
            d = Double.parseDouble(entrada2);
            soma = i + d;
            System.out.printf("Resultado: %.3f", soma);
        } catch (NumberFormatException ex) {
            System.out.println("Erro de entrada de dados. Entrada 1 deve ser um inteiro e Entrada 2 deve ser um real.");
            System.out.println("Entrada 1="+entrada1);
            System.out.println("Entrada 2="+entrada2);
            //ex.printStackTrace();
        }
    }
}
