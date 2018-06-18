package aulas.exemplos.ooII;

/**
 *
 * @author Rafael
 */
public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    private int periodoAtual;
    private String[] disciplinasMatriculadas;
    public Aluno(String nome, long rg, long cpf, String endereco,
            String matricula, String curso,
            int periodoAtual, String[] disciplinasMatriculadas) {
        super(nome,rg,cpf,endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.periodoAtual = periodoAtual;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }
    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getPeriodoAtual() {
        return periodoAtual;
    }
    public void setPeriodoAtual(int periodoAtual) {
        this.periodoAtual = periodoAtual;
    }
}
