package aulas.prova01.containvestimento;

public class ContaInvestimento extends Conta implements Imprimivel {
    private double montanteMinimo;
    private double depositoMinimo;

    public ContaInvestimento(int numero, String dono, double saldo, double montanteMinimo, double depositoMininmo) {
        super(numero, dono,saldo);
        this.montanteMinimo = montanteMinimo;
        this.depositoMinimo = depositoMininmo;
     }
    @Override
    public String imprimeConta() {
        return "-------------------------\n" +
                "Cliente: "+getDono() +"\n" +
                        "Numero:" + getNumero() + "\n" +
                        "Saldo=" + getSaldo() + "\n";
    }

    @Override
    public boolean deposita(double valor) {
        if(valor>=depositoMinimo){
           return super.deposita(valor);
        }else
            return false;
    }

    @Override
    public boolean saca(double valor) {
        double novoValor = this.getSaldo() - valor;
        if(novoValor >= montanteMinimo){
            return super.saca(valor);
        }else
            return false;
    }

    public double getDepositoMinimo() {
        return depositoMinimo;
    }

    public void setDepositoMinimo(double depositoMinimo) {
        this.depositoMinimo = depositoMinimo;
    }

    public double getMontanteMinimo() {
        return montanteMinimo;
    }

    public void setMontanteMinimo(double montanteMinimo) {
        this.montanteMinimo = montanteMinimo;
    }
    

}
