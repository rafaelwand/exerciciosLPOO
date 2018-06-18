/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ufpr.xadrez;

/**
 *
 * @author Rafael
 */
public class TrataEventos {

    private Peca pecaSelecionada;

    public void trataEvento(int posicao) throws Exception{
        switch(JogoXadrez.getJogoXadrez().getVezjogo()){
            case VEZBRANCO:
                trataVezBranco(posicao);
                break;
            case VEZPRETO:
                trataVezPreto(posicao);
                break;
            case BRANCOPECASELECIONADA:
                trataBrancoPecaSelecionada(posicao);
                break;
            case PRETOPECASELECIONADA:
                trataPretoPecaSelecionada(posicao);
                break;
            default:

        }
    }

    private void trataVezBranco(int posicao) throws Exception {
        JogoXadrez jogo = JogoXadrez.getJogoXadrez();
        Peca peca = jogo.getTabuleiro().getPeca(posicao);
        if(peca==null){
            throw new Exception("Nenhuma peça nesta posição. Por favor selecione uma peça branca.");
        }
        if(peca.getCor().equals(Peca.Cor.PRETA)){
            throw new Exception("Vez do branco. Por favor, selecione uma peça branca.");
        }
        //Seleciona a peca
        pecaSelecionada = peca;
        //Muda de status do jogo
        if(jogo.getStatusjogo().equals(JogoXadrez.StatusJogo.NAOINICIADO)){
            jogo.setStatusjogo(JogoXadrez.StatusJogo.EMANDAMENTO);
        }
        //Muda status da vez
        jogo.setVezjogo(JogoXadrez.VezJogo.BRANCOPECASELECIONADA);
        
    }

    private void trataVezPreto(int posicao) throws Exception{
        JogoXadrez jogo = JogoXadrez.getJogoXadrez();
        Peca peca = jogo.getTabuleiro().getPeca(posicao);
        if(peca==null){
            throw new Exception("Nenhuma peça nesta posição. Por favor selecione uma peça preta.");
        }
        if(peca.getCor().equals(Peca.Cor.BRANCA)){
            throw new Exception("Vez do preto. Por favor, selecione uma peça preta.");
        }
        //Seleciona a peca
        pecaSelecionada = peca;
        //Muda de status do jogo
        if(jogo.getStatusjogo().equals(JogoXadrez.StatusJogo.NAOINICIADO)){
            jogo.setStatusjogo(JogoXadrez.StatusJogo.EMANDAMENTO);
        }
        //Muda status da vez
        jogo.setVezjogo(JogoXadrez.VezJogo.PRETOPECASELECIONADA);

    }

    private void trataBrancoPecaSelecionada(int posicao) throws Exception {
        //Valida movimento
        JogoXadrez jogo = JogoXadrez.getJogoXadrez();
        Tabuleiro tabuleiro = JogoXadrez.getJogoXadrez().getTabuleiro();
        //Verifica se é a mesma posicao
        if(posicao==pecaSelecionada.getPosicao()){
            jogo.setVezjogo(JogoXadrez.VezJogo.VEZBRANCO);
            pecaSelecionada = null;
            throw new Exception("Escolha outra peça. Vez do branco.");
        }
        //realiza movimento
        pecaSelecionada.realizaMovimento(posicao);

        jogo.setVezjogo(JogoXadrez.VezJogo.VEZPRETO);

    }

    private void trataPretoPecaSelecionada(int posicao) throws Exception{
        //Valida movimento
        JogoXadrez jogo = JogoXadrez.getJogoXadrez();
        Tabuleiro tabuleiro = JogoXadrez.getJogoXadrez().getTabuleiro();
        //Verifica se é a mesma posicao
        if(posicao==pecaSelecionada.getPosicao()){
            jogo.setVezjogo(JogoXadrez.VezJogo.VEZPRETO);
            pecaSelecionada = null;
            throw new Exception("Escolha outra peça. Vez do preto.");
        }
        //realiza movimento
        pecaSelecionada.realizaMovimento(posicao);

        jogo.setVezjogo(JogoXadrez.VezJogo.VEZBRANCO);

    }
}
