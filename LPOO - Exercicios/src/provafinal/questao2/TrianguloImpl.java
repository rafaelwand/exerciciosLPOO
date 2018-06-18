/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal.questao2;
/**
 *
 * @author Rafael
 */
public class TrianguloImpl extends Forma implements Triangulo {
    private double base;
    private double altura;
    public TrianguloImpl(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public double area(){
        return (this.base*this.altura)/2;
    }
}