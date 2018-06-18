package aulas.semana09.prova;
public class Celta implements Automovel{
    private double velocidade=0;
    public double getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(double distancia, double tempo){
        velocidade =  distancia/tempo;
    }
    public void setVelocidade(double velocidade){
        this.velocidade=velocidade;
    }
}
