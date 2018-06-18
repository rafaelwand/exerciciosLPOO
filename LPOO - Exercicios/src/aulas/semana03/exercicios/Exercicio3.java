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
public class Exercicio3 {
    public static void main(String args[]){
        System.out.println("Digite o montante desejado");
        Scanner sc = new Scanner(System.in);
        double montanteDesejado = sc.nextDouble();
        System.out.println("Digite o valor dos depósitos");
        double deposito = sc.nextDouble();
        double montanteCalculado=0.0;
        int numeroMeses = 0;
        while(montanteCalculado < montanteDesejado){
            montanteCalculado +=deposito;
            montanteCalculado += montanteCalculado*0.005;
            numeroMeses++;
           System.out.println("Mes "+numeroMeses+"="+montanteCalculado);
        }
        System.out.println("São necessários "+ numeroMeses + " meses, para obter um valor de "+montanteCalculado);

    }
}
