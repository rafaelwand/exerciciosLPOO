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
public class Exercicio7 {
    public static void main(String args[]){
        System.out.println("Insira a frase para testar o palíndromo (sem acentos e sem sinais ortográficos)");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        frase = frase.toUpperCase();
        frase = frase.trim();
        String fraseSemEspaco="";
        String fraseInvertida="";
        //Retirar os espaços da frase
        for(int i=0;i<=frase.length()-1;i++){
            if(frase.charAt(i)!=' ')
                fraseSemEspaco=String.valueOf(frase.charAt(i))+fraseSemEspaco;
        }
        frase = fraseSemEspaco;
        //Inverter a frase
        for(int i=frase.length()-1;i>=0;i--){
            fraseInvertida=fraseInvertida+String.valueOf(frase.charAt(i));
        }
        if(fraseInvertida.equalsIgnoreCase(frase)){
            System.out.println("A frase é palíndrome!!!");
        }else{
            System.out.println("A frase NÃO é palíndrome!!!");
        }
    }

}
