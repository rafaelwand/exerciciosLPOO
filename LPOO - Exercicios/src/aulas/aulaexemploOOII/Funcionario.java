/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.aulaexemploOOII;

/**
 *
 * @author Rafael
 */
public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;

    public Funcionario(String matricula, double salario, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario["+getNome()+","+getCpf()+","+getMatricula()+","+getSalario()+"]"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return "Sr. "+ super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    


    
    
    
}
