/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana03.exercicios;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercicio11 {
    public static void main(String[] args){
        System.out.println("Digite a dimensão da matriz quadrada:");
        Scanner sc = new Scanner(System.in);
        int dimensaoMatriz = sc.nextInt();
        double[][] matriz = new double[dimensaoMatriz][dimensaoMatriz];
        preencherMatriz(matriz);
        double determinante = calcularSomatoria(matriz);
        System.out.println("Determinante="+determinante);
    }
    
    public static void preencherMatriz(double[][] matriz){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("Digite o valor de m["+i+"]["+j+"]");
                matriz[i][j]=sc.nextDouble();
            }
        }
    }

    private static double calcularSomatoria(double[][] matriz) {
        double multiplicacao=1;
        double somaPrincipal=0;
        
        //Diagonal principal
        for (int i = 0; i < matriz.length; i++) // numero de loops
        {
            for (int j = 0; j < matriz.length; j++) {
                int y = (i + j) % matriz.length;
                multiplicacao = multiplicacao * matriz[j][y];
            }
            somaPrincipal = somaPrincipal + multiplicacao;
            multiplicacao=1;
        }
        double somaSecundaria=0;
        multiplicacao=1;
        //Diagonal secundaria
        for (int i = matriz.length-1; i >=0 ; i--) // numero de loops
        {
            for (int j = 0; j < matriz.length; j++) {
                int y = (i + j) % matriz.length;
                multiplicacao = multiplicacao * matriz[j][y];
            }
            somaSecundaria += multiplicacao;
            multiplicacao=1;
        }
        double determinante = somaPrincipal - somaSecundaria;
        return determinante;
        
    }
}
