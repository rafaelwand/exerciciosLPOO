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
public class Cavalo extends Peca{

    public Cavalo(int posicaoLinha, int posicaoColuna, Cor cor, String imagemPeca){
        super(Peca.NomePeca.CAVALO,posicaoLinha,posicaoColuna,cor,imagemPeca);
    }

    public Cavalo(int posicao,Cor cor, String imagemPeca){
        super(Peca.NomePeca.CAVALO,posicao,cor,imagemPeca);
    }

    @Override
    public boolean validaMovimento(int posicaoFinal) {
        return true;
    }

}
