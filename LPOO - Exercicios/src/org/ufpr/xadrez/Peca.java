/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ufpr.xadrez;

import org.ufpr.xadrez.Tabuleiro.CasaTabuleiro;

/**
 *
 * @author Rafael
 */
public abstract class Peca {
    public enum NomePeca {REI,RAINHA,TORRE,CAVALO,BISPO,PEAO};
    public enum Cor {BRANCA,PRETA};
    private NomePeca nomePeca;
    private Cor cor;
    private String imagemPeca;
    private int posicaoLinha;
    private int posicaoColuna;
    private int posicao;

    public Peca(NomePeca nomePeca,int posicaoLinha,int posicaoColuna, Cor cor, String imagemPeca){
        this.nomePeca=nomePeca;
        this.cor = cor;
        this.imagemPeca=imagemPeca;
        this.setPosicaoXY(posicaoLinha,posicaoColuna);
    }

    public Peca(NomePeca nomePeca,int posicao,Cor cor, String imagemPeca){
        this.nomePeca=nomePeca;
        this.cor = cor;
        this.imagemPeca=imagemPeca;
        this.setPosicao(posicao);
    }

    public NomePeca getNomePeca() {
        return nomePeca;
    }

    protected void setNomePeca(NomePeca nomePeca) {
        this.nomePeca = nomePeca;
    }

    public int getPosicao() {
        return posicao;
    }

    protected void setPosicao(int posicao) {
        this.posicao = posicao;
        this.posicaoLinha = posicao / 8;
        this.posicaoColuna = posicao % 8;
    }

    public int getPosicaoX() {
        return posicaoLinha;
    }

    protected void setPosicaoXY(int posicaoLinha,int posicaoColuna) {
        setPosicao(posicaoLinha*8+posicaoColuna);
    }

    public int getPosicaoY() {
        return posicaoColuna;
    }
    public Cor getCor() {
        return cor;
    }

    protected void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getImagemPeca() {
        return imagemPeca;
    }

    protected void setImagemPeca(String imagemPeca) {
        this.imagemPeca = imagemPeca;
    }

    public abstract boolean validaMovimento(int posicaoFinal);

    public void realizaMovimento(int posicaoFinal) throws Exception{
        if(!validaMovimento(posicaoFinal)){
            throw new Exception("Movimento inválido");
        }
        //Realiza movimento no tabuleiro controle
        //Retira da casa origem
        JogoXadrez.getJogoXadrez().getTabuleiro().getCasaTabuleiro(this.posicao).removePeca();
        //Seta a posicao da peca
        setPosicao(posicaoFinal);
        //Inclui na casa destino
        JogoXadrez.getJogoXadrez().getTabuleiro().getCasaTabuleiro(posicaoFinal).setPeca(this);
    }

}
