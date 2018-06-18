/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package semana09_exemplos_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rafael
 */
public class PrimeiraTela extends JFrame {
   // Componentes ativos
   private JTextField caixaTexto;
   private JButton vermelho;
   private JButton azul;
   // Componentes não-ativos
   private JLabel label;
   private JLabel label2;
   // Outros elementos: Formatador decimal
   //DecimalFormat df = new DecimalFormat("###,##0.000");
   private Container cp;
   // Construtor
   public PrimeiraTela(){
       super("Primeira Janela");
       caixaTexto = new JTextField();
       vermelho = new JButton("Vermelho");
       label = new JLabel("Label");
       label2 = new JLabel();
       azul = new JButton("Azul");

       caixaTexto.setToolTipText("Insira um texto para teste!");
       vermelho.setToolTipText("Este botão não faz nada!");

       cp = getContentPane();
       cp.setLayout(null);
       label.setBounds(5,5,40,20);
       cp.add(label);
       caixaTexto.setBounds(40,5,150,20);
       cp.add(caixaTexto);
       vermelho.setBounds(5,30,90,20);
       cp.add(vermelho);
       azul.setBounds(100,30,90,20);
       cp.add(azul);
       label2.setBounds(5,50,190,20);
       cp.add(label2);

        setBounds(50, 50, 210, 115);
      // registro dos event-listeners
      vermelho.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            fazAcaoBotao();
      }});

      azul.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            fazAcaoAzul();
      }});

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
   }

   private void fazAcaoBotao(){
       label2.setText(caixaTexto.getText());
       cp.setBackground(Color.RED);

   }

   private void fazAcaoAzul(){
       label2.setText(caixaTexto.getText());
       cp.setBackground(Color.BLUE);

   }

   public static void main(String[] args){
       new PrimeiraTela().setVisible(true);
   }
}
