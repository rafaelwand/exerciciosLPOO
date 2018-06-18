/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Variancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o numero de amostras: ");
        int n = sc.nextInt();
        int soma = 0;
        double[] amostras = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Escreva a amostra: " + i+1);
            amostras[i] = sc.nextDouble();
            soma+=amostras[i];
        }
        double media = (soma/n);
        double somatorio = 0;
        for (int j = 0; j < n; j++) {
          somatorio+=(amostras[j]-media)*(amostras[j]-media);
             }
        somatorio = (somatorio/(n-1));
        System.out.println("A variancia e: " +somatorio);
    }
}

