/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DuvidaAlunos;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;///

/**
 *
 * @author Rafael
 */
public class Conversor extends JFrame {
    //Componentes ativos

    private JTextField tfValor1, tfValor2;
    private JButton bLimpar, bConverter;
    //Componentes não-ativos
    private JLabel lUnidade1, lUnidade2;
    DecimalFormat df = new DecimalFormat("###,##0.00");
    private String l = "";
    private String g = "";
    private double litros;
    private double galoes;

    public Conversor() {

        super("Conversor"); //ajuste do título da janela
        //instanciação dos componentes
        try{
        lUnidade1 = new JLabel("Litros: ");
        lUnidade2 = new JLabel("Galões: ");
        tfValor1 = new JTextField();
        tfValor2 = new JTextField();
        bLimpar = new JButton("Limpar");
        bLimpar.setToolTipText("Limpa as caixas de entrada");
        bConverter = new JButton("Converter");
        bConverter.setToolTipText("Efetua a conversão do valor dado");
        //Ajuste do layout e adição dos componentes

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3, 2, 5, 5));
        cp.add(lUnidade1);
        cp.add(tfValor1);
        cp.add(lUnidade2);
        cp.add(tfValor2);
        cp.add(bLimpar);
        cp.add(bConverter);


        //*****registro dos event listeners
        //...
        //*****
        //ajustes para a janela
        cp.setBackground(Color.orange);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();



        bConverter.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // Atribuindo string que foi digitado pelo usuário a uma variável de mesmo tipo

                l = tfValor1.getText();
                g = tfValor2.getText();

                // Criando um objeto Double que interpreta a String "l" para double
                // (Algo me diz que o problema está aqui, certo?)

                final Double lit = Double.parseDouble(l);

                final Double gal = Double.parseDouble(g);

                // Verifico qual dos dois campos está vazio para realizar a conversão litros -> galões ou o oposto.
                if (l == "") {
                    galoes = gal.doubleValue();
                    litros = galoes * 3.785;
                } else {
                    litros = lit.doubleValue();
                    galoes = litros / 3.785;
                }
            }
        });}
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Conversor().setVisible(true);
    }
}
