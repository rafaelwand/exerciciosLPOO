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
public class Rainha extends Peca{

    public Rainha(int posicaoLinha, int posicaoColuna, Cor cor, String imagemPeca){
        super(Peca.NomePeca.PEAO,posicaoLinha,posicaoColuna,cor,imagemPeca);
    }

    public Rainha(int posicao,Cor cor, String imagemPeca){
        super(Peca.NomePeca.PEAO,posicao,cor,imagemPeca);
    }

    @Override
    public boolean validaMovimento(int posicaoFinal) {
        return true;
    }

}
