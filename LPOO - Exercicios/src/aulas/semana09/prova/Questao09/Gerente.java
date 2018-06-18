package aulas.semana09.prova.Questao09;
public class Gerente extends Funcionario{
    public Gerente(String nome, double salario, String rg){
        super(nome,salario,rg);
    }
    public void bonifica() {
        this.setSalario(this.getSalario()*1.3);
    }
}
