package aulas.semana03.exemplosaula;

import java.util.*;

public class ExTratamentoErro5 {

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
        } catch (ArrayIndexOutOfBoundsException /*| InputMismatchException*/ e ) {
            e.printStackTrace();
        }
    }
}
