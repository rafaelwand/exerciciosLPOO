/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana10.exemlos;

/**
 *
 * @author Rafael
 */
public class Boxing {
    public static void main(String a[]){
        //autoboxing: valores são convertidos em Float
        Float array1[] = {-4.65f, 0.18f, 7.329f };
        float soma = 0;
        //aloca novo array
        Double array2[] = new Double[array1.length];
        System.out.print("array1 [ ");
        for (int i=0; i<array1.length;i++){
            System.out.print(array1[i] + " ");
            float aux = array1[i];//auto-desencaixotar
            soma += aux;
            array2[i] = 2.0*array1[i];//auto-encaixotar
        }
        System.out.println("]");
        System.out.println("Soma: "+soma);
    }
}
