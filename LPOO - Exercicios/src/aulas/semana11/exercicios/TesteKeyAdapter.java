package aulas.semana11.exercicios;


import java.awt.event.KeyAdapter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */

public class TesteKeyAdapter extends KeyAdapter {

    private JanelaSobreNome janela;

    public TesteKeyAdapter(JanelaSobreNome janela) {
        this.janela = janela;
    }

    public void keyReleased(java.awt.event.KeyEvent evt) {
        janela.trataDigitacao(evt);
    }
}
