/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula.funcionario;

/**
 *
 * @author Rafael
 */
public abstract class Funcionario extends Pessoa {
    private double salarioBase;
    public static final double salarioMinimo=900;

    public Funcionario(double salarioBase, String nome, int cpf, int rg, String endereco) {
        super(nome, cpf, rg, endereco);
        this.salarioBase = salarioBase;
    }
      
    public double getSalario(){
        return salarioBase + getBonus();
    }
    
    public abstract double getBonus();

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws Exception {
        if(salarioBase >= salarioMinimo){
            if(salarioBase > this.salarioBase)
                this.salarioBase = salarioBase;
            else
                throw new Exception("Salario nao pode ser menor do que o salario atual.");
        }else{
            throw new Exception("Salario nao pode ser menor do que o salario atual.");
        }

    }
    
    
}
