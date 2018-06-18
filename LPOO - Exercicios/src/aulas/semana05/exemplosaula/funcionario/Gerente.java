/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula.funcionario;

/**
 *
 * @author Rafael
 */
public class Gerente extends Funcionario implements Autenticavel{
    public Funcionario[] funcionariosGerenciados;
    public String[] sistemasAutenticaveis;
    public Gerente(String[] sistemasAutenticaveis,Funcionario[] funcionariosGerenciados,double salarioBase, String nome, int cpf, int rg, String endereco) {
        super(salarioBase,nome, cpf, rg, endereco);
        this.funcionariosGerenciados = funcionariosGerenciados;
        this.sistemasAutenticaveis=sistemasAutenticaveis;
     }
    
    @Override
    public double getBonus() {
        double salarioBase = getSalarioBase();
        int numeroFuncionarios = funcionariosGerenciados.length;
        return salarioBase*numeroFuncionarios*0.05;
    }

    @Override
    public boolean autenticar(String sistema) {
        for(String sistemaA:sistemasAutenticaveis){
            if(sistemaA.equalsIgnoreCase(sistema))
                return true;
        }
        return false;
    }
    
}
