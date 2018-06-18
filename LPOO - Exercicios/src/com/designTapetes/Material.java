/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

/**
 *
 * @author Rafael
 */
public class Material {
    public enum ModeloMaterial{COMUM,LUXO,PREMIUM};
    private double precoMetroQuadrado;
    private ModeloMaterial modelo;

    public Material(double precoMetroQuadrado, ModeloMaterial modelo) {
        this.precoMetroQuadrado = precoMetroQuadrado;
        this.modelo = modelo;
    }

    public ModeloMaterial getModelo() {
        return modelo;
    }

    public double getPrecoMetroQuadrado() {
        return precoMetroQuadrado;
    }

}
