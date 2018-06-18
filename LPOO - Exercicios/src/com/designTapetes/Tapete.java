/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

/**
 *
 * @author Rafael
 */
public class Tapete {
    private Forma forma;
    private Material material;

    public Tapete(Forma forma,Material material) {
        this.forma = forma;
        this.material = material;
    }

    public Forma getForma() {
        return forma;
    }


    public double getPreco() {
        return forma.area()*material.getPrecoMetroQuadrado();
    }

    public Material getMaterial(){
        return this.material;
    }




}
