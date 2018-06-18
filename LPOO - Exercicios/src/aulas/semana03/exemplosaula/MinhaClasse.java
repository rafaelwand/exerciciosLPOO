/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class MinhaClasse {
    public static void main(String args[]){
        int a=3;
        int b=4;
        int soma = somar(a,b);
        String resultado = formataResultado(soma);
        System.out.println(resultado);
    }
    public static int somar(int a, int b){
        int soma = a + b;
        return soma;
    }
    
    public static String formataResultado(int soma){
        String resultado = "O resultado é =="+soma;
        return resultado;
    }
}
