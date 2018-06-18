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
public class Torre extends Peca{

    public Torre(int posicaoLinha, int posicaoColuna, Cor cor, String imagemPeca){
        super(Peca.NomePeca.TORRE,posicaoLinha,posicaoColuna,cor,imagemPeca);
    }

    public Torre(int posicao,Cor cor, String imagemPeca){
        super(Peca.NomePeca.TORRE,posicao,cor,imagemPeca);
    }

    @Override
    public boolean validaMovimento(int posicaoFinal) {
        return true;
    }

}
