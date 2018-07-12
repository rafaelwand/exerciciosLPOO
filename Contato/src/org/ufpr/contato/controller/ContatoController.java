/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.contato.controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.ufpr.contato.model.Contato;
import org.ufpr.contato.model.ModeloTabelaContatos;
import org.ufpr.contato.model.dao.ContatoDAO;
import org.ufpr.contato.view.TabelaContatoJFrame;

/**
 *
 * @author rafae
 */
public class ContatoController {
    private final ModeloTabelaContatos model;
    private final TabelaContatoJFrame view;
    private int linhaClicada=-1;
    
    public ContatoController(ModeloTabelaContatos model, TabelaContatoJFrame view){
        this.model = model;
        this.view = view;
    }
    
    public void initController(){
        //Registra o modelo de tabela na tabela
        view.getTabela().setModel(model);
        //Registra os eventos
        view.getListar().addActionListener((ActionEvent evt) -> listAll());
        view.getTabela().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcaContatosSelecionados(evt);
            }
        });
        view.getLimpar().addActionListener((ActionEvent evt) -> limparViewTabela());
        view.getExcluir().addActionListener((ActionEvent evt) -> excluirContatos());
        view.getNovo().addActionListener((ActionEvent evt) -> incluirContato());
        view.getAtualizar().addActionListener((ActionEvent evt) -> atualizarContato());
        initView();
    }
    
    public void initView(){
        java.awt.EventQueue.invokeLater(() -> {
            view.setVisible(true);
        });
    }

    private void listAll() {
        try {
            ContatoDAO dao = new ContatoDAO();
            List<Contato> list = dao.getLista();
            model.setListaContatos(list);
        } catch (SQLException ex) {
            view.showError("Erro ao listar contato. Ex.:"+ex);
        }
    }

    private void marcaContatosSelecionados(MouseEvent evt) {
       //Pega a linha clicada
        linhaClicada = view.getTabela().rowAtPoint(evt.getPoint());
        //Pega o contato da linha clicada
        Contato contato = model.getContato(linhaClicada);
        //Seta os dados nos componentes
        view.setContato(contato);
    }

    private void limparViewTabela() {
        model.limpaTabela();
    }

    private void excluirContatos() {
        try {
            ContatoDAO dao = new ContatoDAO();
            int[] linhasSelecionadas = view.getTabela().getSelectedRows();
            List<Contato> listaExcluir = new ArrayList();
            for (int i = 0; i < linhasSelecionadas.length; i++) {
                Contato contato = model.getContato(linhasSelecionadas[i]);
                dao.excluir(contato);
                listaExcluir.add(contato);

            }
            listaExcluir.forEach((contato) -> {
                model.removeContato(contato);
            });

        } catch (SQLException ex) {
            view.showError("Erro ao excluir contato. "+ex);
        }
    }

    private void incluirContato() {       
         try {
             Contato contato = view.getContato();   
             ContatoDAO dao = new ContatoDAO();
             dao.adiciona(contato);
             model.adicionaContato(contato);
         } catch (SQLException ex) {
             view.showError("Erro ao incluir contato. "+ex);
         }
    }

    private void atualizarContato() {
        try {
            if (linhaClicada != -1) {
                Contato contato = model.getContato(linhaClicada);
                ContatoDAO dao = new ContatoDAO();
                dao.atualiza(contato);
                Contato contatoView = view.getContato();
                contato.clone(contatoView);
                //Atualiza tabela
                model.fireTableRowsUpdated(linhaClicada, linhaClicada);
            }
        } catch (SQLException ex) {
            view.showError("Erro ao atualizar contato. " + ex);
        }

    }

}
