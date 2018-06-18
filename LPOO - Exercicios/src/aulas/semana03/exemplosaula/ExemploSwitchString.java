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
public class ExemploSwitchString {
    public static void main(String args[]){
        System.out.print("Escreva a disciplina ou professor:");
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        switch(a){
            case "Rafael": System.out.println("É o professor.");
                break;
            case "Java": System.out.println("É a disciplina");
                break;
            default:
                System.out.println("Não é o professor e nem a disciplina.");

        }
    }
}
