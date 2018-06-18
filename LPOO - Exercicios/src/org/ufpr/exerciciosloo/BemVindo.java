package org.ufpr.exerciciosloo;

import java.util.Scanner;
/** Classe com um único método
*   @author Rafael
*/
public class BemVindo {
    /*Método main.
      A JVM chama este método quando inicia*/
    /**
     * Método principal da classe que solicita o nome do usuário e imprime uma mensagem.
     * @param args Os argumentos da linha linha de comando.
     */
    public static void main(String args[]){
        System.out.println("Digite seu nome:");
        Scanner scn = new Scanner(System.in);
        String nome = scn.next();
        System.out.println("Bem vindo, "+ nome);
    }
}
