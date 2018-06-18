package aulas.semana09.prova.Questao09;
public interface FuncionarioI {
    //Método que deve ser implementado como abstrato na classe funcionário
    public void bonifica();
    //Muda a variável ativo para falso
    public void demite();
    //Retorna o valor de ativo
    public boolean isAtivo();
    //Retorna o valor do salário
    public double getSalario();
    //Atribui um novo salario
    public void setSalario(double salario);
    //Retorna uma string no seguinte formato: Nome ; RG ; Salário do funcionário; [Ativo/Inativo]
    public String toString();
}
