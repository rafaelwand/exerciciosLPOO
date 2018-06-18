/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana13.exemplos;

/**
 *
 * @author Rafael
 */
public class TempoExecucao {
    public static void main(String[] args){
        long tempo01 = System.currentTimeMillis();
        for(long i=0;i<20000000000L;i++){
            
        }
        long tempo02 = System.currentTimeMillis();
        long tempoExecucao = tempo02 - tempo01;
        System.out.println("Tempo = "+tempoExecucao);
    }
}
