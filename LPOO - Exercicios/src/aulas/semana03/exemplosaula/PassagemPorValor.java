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
public class PassagemPorValor {
    
    public static void main(String args[]){
        double x=1.0;
        double y=2.0;
        double z=3.0;
        double ponto[] = new double[3];
        ponto[0]=x;
        ponto[1]=y;
        ponto[2]=z;
        System.out.println("Valor anterior do primitivo x="+x);
        System.out.println("Valor anterior do array x="+ponto[0]);
        mudaDouble(x);
        mudaPonto(ponto);
        System.out.println("Valor do primitivo x="+x);
        System.out.println("Valor do array x="+ponto[0]);
       
    }
    
    public static void mudaDouble(double copiaDoValor){
        copiaDoValor += 1.0;
    }
    
    public static void mudaPonto(double[] copiaDaReferencia){
        copiaDaReferencia[0] += 1.0;
    }
    
   
}
