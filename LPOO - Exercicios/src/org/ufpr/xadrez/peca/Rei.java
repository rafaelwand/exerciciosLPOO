/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ufpr.xadrez.peca;

import org.ufpr.xadrez.*;
/**
 *
 * @author Rafael
 */
public class Rei extends Peca{

    public Rei(int posicaoLinha, int posicaoColuna, Cor cor, String imagemPeca){
        super(Peca.NomePeca.REI,posicaoLinha,posicaoColuna,cor,imagemPeca);
    }

    public Rei(int posicao,Cor cor, String imagemPeca){
        super(Peca.NomePeca.REI,posicao,cor,imagemPeca);
    }

    @Override
    public boolean validaMovimento(int posicaoFinal) {
        return true;
    }

    public boolean estaEmCheque(Tabuleiro tabuleiro){
        return false;
    }

}
