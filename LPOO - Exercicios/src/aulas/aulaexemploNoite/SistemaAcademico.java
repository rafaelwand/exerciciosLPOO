/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.aulaexemploNoite;

/**
 *
 * @author Rafael
 */
public class SistemaAcademico {
    public static void main(String[] args){
        Disciplina[] disciplinas = new Disciplina[2];
        disciplinas[0] = new Disciplina("LPOO",90);
        disciplinas[1] = new Disciplina("GP",30);
        Aluno a1 = new Aluno("TADS",disciplinas,"João","87423897498");
    }
    
}
