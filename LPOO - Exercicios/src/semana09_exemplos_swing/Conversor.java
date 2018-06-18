package semana09_exemplos_swing;

// importação dos pacotes típicos para GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// pacote extra para formatador decimal
import java.text.*;
public class Conversor extends JFrame {
   // Componentes ativos
   private JTextField tfValor1, tfValor2;
   private JButton bLimpar, bConverter;
   // Componentes n�o-ativos
   private JLabel lUnidade1, lUnidade2;
   // Outros elementos: Formatador decimal
   DecimalFormat df = new DecimalFormat("###,##0.000");
   // Construtor
   public Conversor() {
      super("Conversor"); // ajuste do t�tulo da janela
      // instancia��o e ajustes dos componentes
      lUnidade1 = new JLabel("Celsius");
      lUnidade2 = new JLabel("Farenheit");
      tfValor1 = new JTextField();
      tfValor2 = new JTextField();
      bLimpar = new JButton("Limpar");
      bLimpar.setToolTipText("Limpa as caixas de entrada");
      bConverter = new JButton("Converter");
      bConverter.setToolTipText("Efetua convers�o do valor dado");
      // ajuste do layout e adi��o dos componentes
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(3,2,5,5));
      cp.add(lUnidade1); cp.add(tfValor1);
      cp.add(lUnidade2); cp.add(tfValor2);
      cp.add(bLimpar); cp.add(bConverter);
      // registro dos event-listeners
      bLimpar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bLimparClick();
      }});
      bConverter.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bConverterClick();
      }});
      // ajustes para janela
      //cp.setBackground(Color.orange);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
   }
   // limpa caixas de texto de entrada
   private void bLimparClick() {
      tfValor1.setText("");
      tfValor2.setText("");
      //this.setVisible(false);
   }
   // efetua convers�o conforme conte�do das caixas de texto
   private void bConverterClick() {
      double res;
      // C -> F se tfValor2 vazia e tfValor1 com conte�do
      if (tfValor2.getText().equals("") &&
         !tfValor1.getText().equals("")) {
         try {
            res = 9*Double.parseDouble(tfValor1.getText())/5 + 32;
            tfValor1.setText("");
            tfValor2.setText("" + df.format(res));
         } catch (NumberFormatException exc) {
            tfValor1.selectAll();
            tfValor1.requestFocus();
            Toolkit.getDefaultToolkit().beep();
         }
      // F -> C se tfValor1 vazia e tfValor2 com conte�do
      } else if (tfValor1.getText().equals("") &&
                !tfValor2.getText().equals("")) {
         try {
            res = 5*(Double.parseDouble(tfValor2.getText())-32)/9;
            tfValor2.setText("");
            tfValor1.setText("" + df.format(res));
         } catch (NumberFormatException exc) {
            tfValor2.selectAll();
            tfValor2.requestFocus();
            Toolkit.getDefaultToolkit().beep();
   } } }
   // in�cio da aplica��o
   public static void main(String a[]) {
      new Conversor().setVisible(true);
} }
