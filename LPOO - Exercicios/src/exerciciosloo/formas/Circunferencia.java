/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.formas;

/**
 *
 * @author Rafael
 */
public class Circunferencia implements Superficie {
    private double raio;

    public Circunferencia(double raio){
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area(){
        return Math.PI*raio*raio;
    }

}
