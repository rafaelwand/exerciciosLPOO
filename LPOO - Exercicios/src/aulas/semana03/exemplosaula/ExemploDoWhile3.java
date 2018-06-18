/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana03.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ExemploDoWhile3 {
    public static void main(String args[]){
        /*for(int i=0;i<10;i++){
            System.out.println(i);
        }*/
        int min = 3;
        int max = 10;
        System.out.println (min + "<" + max);
        for(;max-1>min+1;min++){
            max--;
            System.out.println (min + "<" + max);
        }


    }
}
