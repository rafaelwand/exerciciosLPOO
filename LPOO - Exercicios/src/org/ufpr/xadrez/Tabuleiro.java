/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ufpr.xadrez;
import org.ufpr.xadrez.peca.*;

/**
 *
 * @author Rafael
 */
public class Tabuleiro {
    public class CasaTabuleiro{
        private Peca peca;
        private boolean temPeca;

        public Peca getPeca() {
            return peca;
        }

        public void setPeca(Peca peca) {
            this.peca = peca;
            this.temPeca = true;
            //adiciona na gui
            JogoXadrez.getJogoXadrez().getGuiTabuleiro().adicionaPecaTabuleiro(peca);
        }

        public boolean isTemPeca() {
            return temPeca;
        }

        public void removePeca(){
            //remove da Gui
            JogoXadrez.getJogoXadrez().getGuiTabuleiro().removePecaTabuleiro(peca);
            this.peca=null;
            this.temPeca=false;
        }

    }
    private CasaTabuleiro[][] casaTabuleiro = new CasaTabuleiro[8][8];

    public Tabuleiro(){
        //Inicia Tabuleiro
        for(int i=0;i<casaTabuleiro.length;i++){
            for(int j=0;j<casaTabuleiro[i].length;j++){
                //Coloca as pecas na casa do tabuleiro da camada de controle
                casaTabuleiro[i][j] = new CasaTabuleiro();
                Peca peca = getPecaInicial(i,j);
                if(peca!=null)
                    casaTabuleiro[i][j].setPeca(getPecaInicial(i,j));


            }
        }
    }

    public Peca getPeca(int posicao){
        return casaTabuleiro[posicao/8][posicao%8].getPeca();
    }

    public CasaTabuleiro getCasaTabuleiro(int posicao){
        return casaTabuleiro[posicao/8][posicao%8];
    }

    private Peca getPecaInicial(int i, int j) {
        Peca peca=null;
        if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
            peca = new Torre(i,j,Peca.Cor.BRANCA,"/org/ufpr/xadrez/torre_branca.png");
            
        } else if ((i == 0 && j == 1) || (i == 0 && j == 6)) {
            peca = new Cavalo(i,j,Peca.Cor.BRANCA,"/org/ufpr/xadrez/cavalo_branco.png");
        } else if ((i == 0 && j == 2) || (i == 0 && j == 5)) {
            peca = new Bispo(i,j,Peca.Cor.BRANCA,"/org/ufpr/xadrez/bispo_branco.png");
        } else if (i == 0 && j == 3) {
            peca = new Rei(i,j,Peca.Cor.BRANCA,"/org/ufpr/xadrez/rei_branco.png");
        } else if (i == 0 && j == 4) {
            peca = new Rainha(i,j,Peca.Cor.BRANCA,"/org/ufpr/xadrez/rainha_branca.png");
        } else if (i == 1) {
            peca = new Peao(i,j,Peca.Cor.BRANCA,"/org/ufpr/xadrez/peao_branco.png");
        } else if ((i == 7 && j == 0) || (i == 7 && j == 7)) {
            peca = new Torre(i,j,Peca.Cor.PRETA,"/org/ufpr/xadrez/torre_preta.png");
        } else if ((i == 7 && j == 1) || (i == 7 && j == 6)) {
            peca = new Cavalo(i,j,Peca.Cor.PRETA,"/org/ufpr/xadrez/cavalo_preto.png");
        } else if ((i == 7 && j == 2) || (i == 7 && j == 5)) {
            peca = new Bispo(i,j,Peca.Cor.PRETA,"/org/ufpr/xadrez/bispo_preto.png");
        } else if (i == 7 && j == 3) {
            peca = new Rei(i,j,Peca.Cor.PRETA,"/org/ufpr/xadrez/rei_preto.png");
        } else if (i == 7 && j == 4) {
            peca = new Rainha(i,j,Peca.Cor.PRETA,"/org/ufpr/xadrez/rainha_preta.png");
        } else if (i == 6) {
             peca = new Peao(i,j,Peca.Cor.PRETA,"/org/ufpr/xadrez/peao_preto.png");
        }
        return peca;
    }



}
