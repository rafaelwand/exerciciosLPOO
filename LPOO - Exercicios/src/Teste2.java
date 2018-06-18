
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Teste2 {
    public static void main(String[] args){
        System.out.println("Insira uma string");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        nome = nome.toUpperCase();

        switch(nome){
            case "RAFAEL": System.out.println("É o professor.");
                break;
            case "JAVA": System.out.println("É a disciplina");
                break;
            default:
                System.out.println("Não é o professor e nem a disciplina.");

        }
    }
}
