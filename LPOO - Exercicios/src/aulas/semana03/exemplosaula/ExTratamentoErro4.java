package aulas.semana03.exemplosaula;

import java.util.*;

public class ExTratamentoErro4 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("i=" + i);
            System.out.print("Digite um inteiro j= ");
            int j = s.nextInt();
            soma = i + j;
            System.out.println("Soma (i+j)=" + soma);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("A posição do array não é válida.");
            //e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Não é um número válido.");
            e.printStackTrace();
            //e.printStackTrace();
        }
    }
}