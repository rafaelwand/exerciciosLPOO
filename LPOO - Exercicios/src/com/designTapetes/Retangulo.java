/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

/**
 *
 * @author Rafael
 */
public class Retangulo extends Forma{
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double area(){
        return ladoA*ladoB;
    }



}
