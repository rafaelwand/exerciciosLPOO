/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo;

/**
 *
 * @author Rafael
 */
public abstract class Bicicleta {
    private int velocidade;
    private int rpm;

    public Bicicleta(int marcha, int velocidade, int rpm){
        this.velocidade = velocidade;
        this.rpm = rpm;
    }
    public abstract void setMarcha(int marcha);
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public void setRPM(int rpm){
        this.rpm = rpm;
    }

    public int getVelocidade(){
        return this.velocidade;
    }
    public abstract int getMarcha();

    public int getRPM(){
        return this.rpm;
    }
}
