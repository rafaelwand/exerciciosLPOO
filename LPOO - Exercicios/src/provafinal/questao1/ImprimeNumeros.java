package provafinal.questao1;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class ImprimeNumeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor a ser impresso: ");
        try {
            int a = sc.nextInt();
            if (a < 0 || a > 5) {
                throw new ValorNaoSuportadoException();
            }
            switch (a) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Quatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;

            }
        } catch (InputMismatchException ex) {
            System.out.println("O valor inserido não é um inteiro.");
            return;
        } catch (ValorNaoSuportadoException ex) {
            System.out.println("O valor inserido deve estar entre 0 e 5.");
            return;
        }
    }
}
