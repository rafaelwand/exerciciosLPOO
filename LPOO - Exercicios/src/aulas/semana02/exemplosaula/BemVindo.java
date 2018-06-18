package aulas.semana02.exemplosaula;

import java.util.Scanner;
/** Classe com um �nico m�todo
*   @author Rafael
*/
public class BemVindo {
    /*M�todo main.
      A JVM chama este m�todo quando inicia*/
    /**
     * M�todo principal da classe que solicita o nome do usu�rio e imprime uma mensagem.
     * @param args Os argumentos da linha linha de comando.
     */
    public static void main(String args[]){
        System.out.println("Digite seu nome:");
        Scanner scn = new Scanner(System.in);//Obt�m entrada
        String nome = scn.next();
        System.out.println("Bem vindo, "+ nome);
    }
}
