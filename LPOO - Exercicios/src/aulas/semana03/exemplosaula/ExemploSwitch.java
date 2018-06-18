/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class ExemploSwitch {
    public static void main(String args[]){
        System.out.print("Escreva um caractere:");
        Scanner scn = new Scanner(System.in);
        char a = scn.next().charAt(0);
        switch(a){
            case 'a':
            case 'A':System.out.println("Vogal A.");
                break;
            case 'e':
            case 'E':System.out.println("Vogal E.");
                break;
            case 'i':
            case 'I':System.out.println("Vogal I.");
                break;
            case 'o':
            case 'O':System.out.println("Vogal O.");
                break;
            case 'u':
            case 'U':System.out.println("Vogal U.");
                break;
            default:
                System.out.println("Não é uma vogal.");
        }
    }
}
