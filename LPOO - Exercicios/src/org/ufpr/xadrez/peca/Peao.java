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
public class Peao extends Peca{

    public Peao(int posicaoLinha, int posicaoColuna, Cor cor, String imagemPeca){
        super(Peca.NomePeca.BISPO,posicaoLinha,posicaoColuna,cor,imagemPeca);
    }

    public Peao(int posicao,Cor cor, String imagemPeca){
        super(Peca.NomePeca.BISPO,posicao,cor,imagemPeca);
    }

    @Override
    public boolean validaMovimento(int posicaoFinal) {
        return true;
    }

}
