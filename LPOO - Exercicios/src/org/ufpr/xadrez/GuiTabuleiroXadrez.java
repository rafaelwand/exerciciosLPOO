/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.xadrez;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Rafael
 */
public class GuiTabuleiroXadrez extends JFrame {

    private JPanel tabuleiroGui;
    private JTextArea logDeAvisos;

    public GuiTabuleiroXadrez() {
        super("Jogo de Xadrez do Rafael");
        initGuiComponents();

    }

    public void adicionaPecaTabuleiro(Peca peca) {
        //Remove o que houver na posicao
        removePecaTabuleiro(peca);
        //adiciona o conetudo ao tabuleiro
        JLabel conteudocasa = new JLabel();
        conteudocasa.setIcon(new javax.swing.ImageIcon(getClass().getResource(peca.getImagemPeca())));
        JPanel casastabuleiro = (JPanel) tabuleiroGui.getComponent(peca.getPosicao());
        casastabuleiro.add(conteudocasa);
        casastabuleiro.doLayout();
    }

    public void removePecaTabuleiro(Peca peca) {
        //Remove o que houver na posicao
        JPanel casastabuleiro = (JPanel) tabuleiroGui.getComponent(peca.getPosicao());
        casastabuleiro.removeAll();
        casastabuleiro.repaint();
        casastabuleiro.doLayout();
    }

    private void initGuiComponents() {
        //Instancia os componentes
        //Tamanho total da janela
        setSize(800, 600);
        setPreferredSize(new Dimension(800,600));
        //Gerenciador de Layout para a Janela
        Container cp = getContentPane();
        cp.setLayout(null);
        //Instancia a area de mensagem
        logDeAvisos = new JTextArea();
        logDeAvisos.setColumns(20);
        logDeAvisos.setEditable(false);
        logDeAvisos.setRows(5);
        cp.add(logDeAvisos);
        logDeAvisos.setBounds(560,10,200,100);
        //Inicia tabuleiro
        tabuleiroGui = new JPanel();
        //Tamanho para o tabuleiro dentro da Janela
        tabuleiroGui.setLayout(new GridLayout(8, 8, 0, 0));
        //Posição para o tabuleiro na janela
        tabuleiroGui.setBounds(10, 10, 550, 550);
        //Inclui tabuleiro na Janela
        cp.add(tabuleiroGui);
        //Inicia as casas do tabuleiro
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //Instancia cada casa do tabuleiro
                JPanel casaTabuleiro = new JPanel();
                casaTabuleiro.setLayout(new GridLayout(1, 1, 0, 0));
                //Seta o background para cada casa
                //Para linha par e coluna par ou linha impar e coluna impar
                if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)){
                    casaTabuleiro.setBackground(new java.awt.Color(255, 255, 255));
                //Para linha par e coluna impar ou linha impar e coluna par
                }else{
                    casaTabuleiro.setBackground(new java.awt.Color(128, 128, 128));
                }

                //Inclui um nome para as casas
                casaTabuleiro.setName(i + "," + j);
                //Adiciona evento para cada casa do tabulerio
                casaTabuleiro.addMouseListener(new java.awt.event.MouseAdapter() {

                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        trataClick(evt);
                    }
                });

                //Adiciona as casas no tabuleiro
                tabuleiroGui.add(casaTabuleiro);
                //Seta as bordas para as casas do tabuleiro
                casaTabuleiro.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                //As peças serão incluidas pela classe Jogo

            }
        }
        //Finalizar programa ao clicar no botão para fehcar janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Redimensionar a tela para tamanho preferido.
        pack();
        System.out.println("Numero de componentes no tabuleiro = " + tabuleiroGui.getComponentCount());
    }

    private void trataClick(java.awt.event.MouseEvent evt) {
        //Pegar a posição no tabuleiro
        JPanel casatabuleiro = (JPanel) evt.getComponent();
        JPanel tabuleiro = (JPanel) casatabuleiro.getParent();
        int posicao = tabuleiro.getComponentZOrder(casatabuleiro);
        //Delegar o tratamento da posicao para a classe JogoXadrez
        try {
            JogoXadrez.getJogoXadrez().getTrataEventos().trataEvento(posicao);
        } catch (Exception ex) {
            if(ex.getMessage() != null){
                logDeAvisos.setText(ex.getMessage());
            }else{
                ex.printStackTrace();
            }
        }
        System.out.println("Posicao = " + tabuleiro.getComponentZOrder(casatabuleiro));
    }

    public static void main(String[] args) {
        new GuiTabuleiroXadrez().setVisible(true);
    }
}
