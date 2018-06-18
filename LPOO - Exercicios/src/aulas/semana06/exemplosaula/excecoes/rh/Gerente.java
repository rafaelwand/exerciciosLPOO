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
public class Gerente extends Funcionario{

    public Gerente(Analista[] equipe, String matricula, double salario, String nome, String cpf, String rg) {
        super(matricula, salario, nome, cpf, rg);
        this.equipe = equipe;
    }


    
    private Analista[] equipe;

    public Analista[] getEquipe() {
        return equipe;
    }

    public void setEquipe(Analista[] equipe) {
        this.equipe = equipe;
    }
    
    
    
}
