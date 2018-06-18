/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercicio2 {

    public static void main(String args[]) {
        double soma = 0.0;
        for (String elemento : args) {
            double valor = 0.0;
            try {
                valor = Double.parseDouble(elemento);
            } catch (NumberFormatException ex) {
                System.out.println("Valor " + elemento + " ignorado por não ser numérico.");
            }
            soma += valor;
        }
        System.out.println("Soma dos valores = "+soma);
    }
}
