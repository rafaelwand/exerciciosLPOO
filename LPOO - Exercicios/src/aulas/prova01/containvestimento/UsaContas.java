
package aulas.prova01.containvestimento;

import java.sql.SQLException;
import java.util.List;

public class UsaContas {
    public static void main(String[] args) throws SQLException{
        ContaInvestimento contaPeDeChinelo = new ContaInvestimento(1,"Rafael",1000,1000,100);
        ContaInvestimento contaDeRico = new ContaInvestimento(2,"Maria",10000,10000,500);
        contaPeDeChinelo.atualiza(0.01);
        contaDeRico.atualiza(0.03);
        if(contaDeRico.deposita(100))
            System.out.println("Depósito Efetuado! Saldo="+contaDeRico.getSaldo());
        else
            System.out.println("Esta é uma conta de rico. Deposite o mínimo contratado. ");
        contaPeDeChinelo.deposita(100);
        contaDeRico.saca(150);
        System.out.println(contaDeRico.imprimeConta());
        System.out.println(contaPeDeChinelo.imprimeConta());


        ContaInvestimentoDao dao = new ContaInvestimentoDao();
        dao.criaConta(contaPeDeChinelo);
        dao.criaConta(contaDeRico);
        List<ContaInvestimento> lista = dao.listaContaPorSaldoMaior(1200);
        System.out.println("Lista de clientes com saldo maior que 1200:");
        for(Conta conta:lista){
            System.out.println(conta.getDono());
        }
    }
}
