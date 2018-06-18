/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.testeprova;

/**
 *
 * @author Rafael
 */
public class AutomovelImpl implements Automovel{
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
