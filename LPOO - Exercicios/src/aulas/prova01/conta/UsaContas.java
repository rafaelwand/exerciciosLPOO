
package aulas.prova01.conta;

import java.sql.SQLException;
import java.util.List;

public class UsaContas {
    public static void main(String[] args) throws SQLException{
        ContaCorrente c1 = new ContaCorrente(1,"Rafael",0,2000);
        c1.deposita(100);
        c1.saca(20);
        ContaCorrente c2 = new ContaCorrente(2,"Maria",0,0);
        c1.tranfere(c2, 1000);
        c1.atualiza(0.2);
        c2.atualiza(0.1);
        System.out.println(c1.imprimeConta());
        System.out.println(c2.imprimeConta());

        ContaCorrenteDao dao = new ContaCorrenteDao();
        dao.criaConta(c2);
        dao.criaConta(c1);
        List<ContaCorrente> lista = dao.listaContaPorSaldoMaior(-100);
        System.out.println("Lista de clientes com saldo maior que -100:");
        for(Conta conta:lista){
            System.out.println(conta.getDono());
        }

    }
}
