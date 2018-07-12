/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.contato.controller;

import org.ufpr.contato.model.ModeloTabelaContatos;
import org.ufpr.contato.view.TabelaContatoJFrame;

/**
 *
 * @author rafae
 */
public class Main {
    public static void main(String[] args){
        ModeloTabelaContatos model = new ModeloTabelaContatos();
        TabelaContatoJFrame view = new TabelaContatoJFrame();
        ContatoController controller = new ContatoController(model,view);
        controller.initController();
    }
    
}
