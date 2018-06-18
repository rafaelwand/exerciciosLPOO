package aulas.prova01.conta;
public abstract class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String dono;
    public Conta(int numero,String dono, double saldo, double limite){
        this.numero=numero;
        this.dono=dono;
        this.limite=limite;
        this.saldo=saldo;
    }
    public void deposita(double valor){
        saldo += valor;
    }
    public boolean saca(double valor){
        double saldoNovo = saldo - valor;
        if((saldoNovo+limite)>=0){
            saldo = saldoNovo;
            return true;
        }else{
            return false;
        }
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
    public void setLimite(double valor){
        if(valor>=0)
            this.limite=valor;
    }
    public double getLimite(){
        return limite;
    }
    public abstract void atualiza(double taxaSelic);
}