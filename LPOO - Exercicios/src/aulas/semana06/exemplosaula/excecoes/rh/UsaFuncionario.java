/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana06.exemplosaula.excecoes.rh;


/**
 *
 * @author Rafael
 */
public class UsaFuncionario {
    public static void main(String args[]){
        Analista[] equipe = new Analista[1];
        equipe[0]= new Analista("1",1000,"João","1","1");
        Gerente g = new Gerente(null,"2",5000,"Gustavo","2","2");
        //Analista[] lista = g.getEquipe();
        for(Analista a:g.getEquipe()){
            System.out.println(a.getNome());
        }
        //f.getNome().toString();
        //f.getNome().equals("A");

        
    }
}






        //Analista analista = new Analista("1",1000,"João","1","1");
        //Analista[] equipe = new Analista[1];
        //equipe[0]=analista;

