/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provafinal.questao2;

/**
 *
 * @author Rafael
 */
public class RetanguloImpl extends Forma implements Retangulo{
    private double ladoA;
    private double ladoB;
    public RetanguloImpl(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public double getLadoA(){
        return ladoA;
    }
    public double getLadoB(){
        return ladoB;
    }
    public double area(){
        return this.ladoA*this.ladoB;
    }
}