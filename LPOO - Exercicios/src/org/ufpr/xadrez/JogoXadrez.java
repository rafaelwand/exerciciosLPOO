/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ufpr.xadrez;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class JogoXadrez {

    private ArrayList<Peca> pecasForaDoTabuleiro;
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private GuiTabuleiroXadrez guiTabuleiro;
    public enum VezJogo{VEZBRANCO,VEZPRETO,BRANCOPECASELECIONADA,PRETOPECASELECIONADA};
    public enum StatusJogo{NAOINICIADO,EMANDAMENTO,CHEQUEBRANCO,CHEQUEPRETO,JOGOENCERRADO};
    private VezJogo vezjogo;
    private StatusJogo statusjogo;
    private TrataEventos trataEventos;
    private static final JogoXadrez jogo = new JogoXadrez();

    public static void main(String[] args){
        //Inicia Jogo
        jogo.iniciaJogo();
    }

    public static JogoXadrez getJogoXadrez(){
        return jogo;
    }

    private void iniciaJogo(){
        //Cria interface gráfica
        guiTabuleiro = new GuiTabuleiroXadrez();
        //Cria o tabuleiro
        tabuleiro = new Tabuleiro();
        //Inicia status
        vezjogo=VezJogo.VEZBRANCO;
        statusjogo=StatusJogo.NAOINICIADO;
        //Torna interface visíveil
        guiTabuleiro.setVisible(true);
        //Inicia classe que trata os eventos
        trataEventos = new TrataEventos();


    }

    public TrataEventos getTrataEventos(){
        return trataEventos;
    }

    public GuiTabuleiroXadrez getGuiTabuleiro() {
        return guiTabuleiro;
    }

    public void setGuiTabuleiro(GuiTabuleiroXadrez guiTabuleiro) {
        this.guiTabuleiro = guiTabuleiro;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public ArrayList<Peca> getPecasForaDoTabuleiro() {
        return pecasForaDoTabuleiro;
    }

    public void setPecasForaDoTabuleiro(ArrayList<Peca> pecasForaDoTabuleiro) {
        this.pecasForaDoTabuleiro = pecasForaDoTabuleiro;
    }

    public StatusJogo getStatusjogo() {
        return statusjogo;
    }

    public void setStatusjogo(StatusJogo statusjogo) {
        this.statusjogo = statusjogo;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public VezJogo getVezjogo() {
        return vezjogo;
    }

    public void setVezjogo(VezJogo vezjogo) {
        this.vezjogo = vezjogo;
    }



}
