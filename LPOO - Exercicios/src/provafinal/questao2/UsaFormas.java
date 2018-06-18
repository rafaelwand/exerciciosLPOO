/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provafinal.questao2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class UsaFormas {
    public static void main(String args[]){
        Forma forma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma das opções:\n"
                            + "(1) Para área do triângulo \n"
                            + "(2) Para área do retângulo");
        try{
            int escolha = sc.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Digite a base e em seguida a altura:");
                    double base = sc.nextDouble();
                    double altura = sc.nextDouble();
                    forma = new TrianguloImpl(base,altura);
                    break;
                case 2:
                    System.out.println("Digite o valor de um lado e em seguida de outro:");
                    double ladoA = sc.nextDouble();
                    double ladoB = sc.nextDouble();
                    forma = new RetanguloImpl(ladoA,ladoB);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    return;
           }
           System.out.println("A área da forma é="+forma.area());
        }catch(InputMismatchException ex){
            System.out.println("O valor digitado não é um valor válido.");
        }
    }
}
