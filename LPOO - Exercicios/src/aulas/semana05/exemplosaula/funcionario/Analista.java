/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula.funcionario;

/**
 *
 * @author Rafael
 */
public class Analista extends Funcionario {
    public Analista(double salarioBase, String nome, int cpf, int rg, String endereco) {
        super(salarioBase,nome, cpf, rg, endereco);
     }
    @Override
    public double getBonus() {
        return 0;
    }
    
}
