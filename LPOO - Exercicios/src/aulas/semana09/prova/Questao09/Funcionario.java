package aulas.semana09.prova.Questao09;
public abstract class Funcionario extends Pessoa implements FuncionarioI {
    private double salario;
    private boolean ativo;
    public Funcionario(String nome, double salario, String rg) {
        super(nome,rg);
        this.salario=salario;
        ativo=true;
    }
    public abstract void bonifica();
    public void demite() {
        this.ativo = false;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario=salario;
    }
    public String toString(){
        return "Nome:"+this.getNome() +" ; RG:"+this.getRg()+" ; Salário:"+salario;
    }
}
