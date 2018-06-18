/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana05.exemplosaula.alunoprofessor;

/**
 *
 * @author Rafael
 */
public class Professor extends Pessoa{
    private String codigoSIAPE;
    private String titulacao;
    private String[] disciplinasMinistradas;
    private String curso;

    public Professor(String nome, long rg, long cpf, String endereco, String codigoSIAPE, String titulacao, String[] disciplinasMinistradas, String curso) {
        super(nome,rg,cpf,endereco);
        this.codigoSIAPE = codigoSIAPE;
        this.titulacao = titulacao;
        this.disciplinasMinistradas = disciplinasMinistradas;
        this.curso = curso;
    }

    public String getCodigoSIAPE() {
        return codigoSIAPE;
    }

    public void setCodigoSIAPE(String codigoSIAPE) {
        this.codigoSIAPE = codigoSIAPE;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(String[] disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }


}
