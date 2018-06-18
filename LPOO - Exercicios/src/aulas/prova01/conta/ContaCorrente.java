package aulas.prova01.conta;

public class ContaCorrente extends Conta implements Transferivel,Imprimivel {

    public ContaCorrente(int numero, String dono, double saldo, double limite) {
        super(numero, dono,saldo, limite);
    }

    public boolean tranfere(Conta destino, double valor) {
        if (saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        double saldo = getSaldo();
        if(saldo>=0){
            double acrescimo = saldo*(taxaSelic);
            deposita(acrescimo);
        }
    }

    @Override
    public String imprimeConta() {
        return "-------------------------\n" +
                "Cliente: "+getDono() +"\n" +
                        "Numero:" + getNumero() + "\n" +
                        "Saldo=" + getSaldo() + "\n" +
                        "Limite=" + getLimite() + "\n" +
                        "Disponivel="+(getLimite()+getSaldo());
    }
}
