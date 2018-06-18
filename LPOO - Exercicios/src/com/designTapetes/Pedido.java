/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Pedido {
    int identificadorPedido;
    List<Tapete> tapetes;
    double preco;

    public Pedido(List<Tapete> tapetes, int identificadorPedido) {
        this.identificadorPedido = identificadorPedido;
        this.tapetes = tapetes;
        this.preco=0;
        for(Tapete tapete: tapetes){
            this.preco=this.preco+tapete.getPreco();
        }
    }

    public int getIdentificadorPedido(){
        return 0;
    }

    public double getPreco() {
        return preco;
    }

    public List<Tapete> getTapetes() {
        return tapetes;
    }

    public void adicionaTapetesNoPedido(List<Tapete> tapetes){
        for(Tapete tapete: tapetes){
            this.tapetes.add(tapete);
            this.preco=this.preco+tapete.getPreco();
        }
    }


    public List<Tapete> getTapetesPorMaterial(Material material){
        List<Tapete> listaRetorno = new ArrayList<Tapete>();
        for(Tapete tapete: tapetes){
            if(tapete.getMaterial().getModelo().equals(material.getModelo())){
                listaRetorno.add(tapete);
            }
        }
        return null;
    }

}
