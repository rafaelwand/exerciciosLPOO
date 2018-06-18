/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.prova01.conta;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface ContaCorrenteDaoI {
    //Método que recebe uma referência de Conta e insere na tabela CONTA da base dados
    public void criaConta(ContaCorrente conta);
    //Método que lista o conjunto de contas cujo saldo é maior do que o parâmetro saldo
    public List<ContaCorrente> listaContaPorSaldoMaior(double saldo);
}
