package aulas.semana06.exemplosaula.excecoes;
import java.util.*;

public class ExTratamentoErro {

    public static void main(String args[]) {
        int i;
        double d, soma;
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Digite um inteiro: ");
            i = s.nextInt();
            System.out.println("Digite um real: ");
            d = s.nextDouble();
            soma = i + d;
            System.out.printf("Resultado: %.3f", soma);
        }catch(InputMismatchException e){
            System.out.println("Tipo de dado incompatível.");
        }
        
    }
}
