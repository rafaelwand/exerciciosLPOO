/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

/**
 *
 * @author Rafael
 */
public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

 

    public double area(){
        return Math.PI*raio*raio;
    }

}
