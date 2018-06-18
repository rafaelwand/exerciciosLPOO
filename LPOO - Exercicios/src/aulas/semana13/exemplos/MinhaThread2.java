/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana13.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
class MinhaThread2 extends Thread {
    
    static private int cont=0;
    
    private List<Double> valores;
    private double soma;
    
    public MinhaThread2(List<Double> valores){
        this.valores = valores;
    }

    @Override
    public void run() {
        soma=0;
        for(double valor:valores){
            soma+=valor;
        }
        
        /*System.out.println("Inicio: " + getName());
        for (int i = 0; i < 5; i++) {
            cont++;
            System.out.println(i + " " + getName());

        }
        System.out.println("Fim: " + getName());*/
    }

    public static void main(String[] args) throws InterruptedException {
        long t0 = System.currentTimeMillis();
        System.out.println("Início geral.");
        List<Double> valores = new ArrayList();
        for(int i=0;i<30;i++){
            valores.add(Math.random()*100);
        }
        List<Double> valores2 = new ArrayList();
        for(int i=0;i<30;i++){
            valores2.add(Math.random()*100);
        }
        
        MinhaThread2 t = new MinhaThread2(valores);
        t.start();
        MinhaThread2 t2 = new MinhaThread2(valores2);
        t2.start();
        sleep(10);
        //System.out.println("Valor cont Passo 1="+cont);
        t.join();
        t2.join();
        System.out.println("soma 1="+t.soma);
        System.out.println("soma 2="+t2.soma);
        long t1 = System.currentTimeMillis();
        System.out.println("Tempo decorrido= "+(t1-t0));
        
        /*System.out.println("Início geral.");
            MinhaThread2 t1 = new MinhaThread2();
            t1.setName("T1");
            MinhaThread2 t2 = new MinhaThread2();
            t2.setName("T2");
            MinhaThread2 t3 = new MinhaThread2();
            t3.setName("T3");
            t1.start();
            t1.join();            

            t2.start();
            t2.join();
            t3.start();
            //t2.join();
            t3.join();
            
            System.out.println("Fim geral.");*/
    }
}
