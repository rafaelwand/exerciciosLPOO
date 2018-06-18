package aulas.prova01.containvestimento;
public abstract class Conta {
    private int numero;
    private double saldo;
    private String dono;
    public Conta(int numero,String dono, double saldo){
        this.numero=numero;
        this.dono=dono;
        this.saldo=saldo;
    }
    public boolean deposita(double valor){
        if(valor>0){
            this.saldo += valor;
            return true;
        }else
            return false;
    }
    public boolean saca(double valor){
        if(valor>0){
            this.saldo -= valor;
            return true;
        }else
            return false;
    }
    public String getDono(){
        return dono;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void atualiza(double taxaSelic) {
        double saldo = getSaldo();
        if(saldo>=0){
            this.saldo = saldo*(taxaSelic) + saldo;
        }
    }
}