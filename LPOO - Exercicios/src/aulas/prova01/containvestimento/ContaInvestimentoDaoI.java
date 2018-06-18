/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.prova01.containvestimento;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface ContaInvestimentoDaoI {
    //Método que recebe uma referência de Conta e insere na tabela CONTA da base dados
    public void criaConta(ContaInvestimento conta);
    //Método que lista o conjunto de contas cujo saldo é maior do que o parâmetro saldo
    public List<ContaInvestimento> listaContaPorSaldoMaior(double saldo);
}
