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
public class Aluno extends Pessoa{
    private String curso;
    private Disciplina[] disciplinasMatriculadas;

    public Aluno(String curso, Disciplina[] disciplinasMatriculadas, String nome, String cpf) {
        super(nome, cpf);
        this.curso = curso;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public String getCurso() {
        return curso;
    }

    public Disciplina[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplinasMatriculadas(Disciplina[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    

    
    
    
    
}
