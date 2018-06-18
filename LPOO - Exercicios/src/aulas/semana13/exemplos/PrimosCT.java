package aulas.semana13.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PrimosCT extends JFrame implements ActionListener {
   private JTextField tf1 = new JTextField(), tf2  = new JTextField();
   private JButton b1 = new JButton("Cancelar"),
                   b2 = new JButton("Calcular") ;
   private JTextArea ta1 = new JTextArea();
   private boolean stop;
   public PrimosCT() {
      super("Primos Com Thread");
      Container cp = getContentPane();
      JPanel p1 = new JPanel(new GridLayout(1, 4, 3, 3));
      p1.add(new JLabel("Inicio", JLabel.RIGHT)); p1.add(tf1);
      p1.add(new JLabel("Fim", JLabel.RIGHT)); p1.add(tf2);
      cp.add("North", p1);
      JScrollPane sp = new JScrollPane(ta1);
      ta1.setEditable(false); ta1.setLineWrap(true);
      ta1.setWrapStyleWord(true);
      sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      cp.add("Center", sp);
      JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      p1 = new JPanel(new GridLayout(1, 2, 3, 3));
      p1.add(b1); p1.add(b2);
      p2.add(p1);
      cp.add("South", p2);
      b1.addActionListener(this);
      b2.addActionListener(this);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) { stop = true; }
      });
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(280, 200);
   }
   public void actionPerformed(ActionEvent e) {
      if (e.getSource()==b2) {
         try {
            b2.setEnabled(false);
            new Calculo().start();
         } catch (NumberFormatException nfe) {
            ta1.setText("Intervalo inv�lido!");
            return;
         }
      } else {
         stop = true;
         b2.setEnabled(true);
   } }
   public void calcPrimos(int inicio, int fim) {
      ta1.setText("Calculando:\n");
      stop = false;
      for (int n=inicio; n<=fim && !stop; n++) {
         int i;
         for (i=2; i<n; i++)
            if (n%i==0) break;
         if (i==n) ta1.append(n+", ");
      }
      ta1.append("\n");
   }
   private class Calculo extends Thread {
      public void run() {
         calcPrimos(Integer.parseInt(tf1.getText()),
                        Integer.parseInt(tf2.getText()));
         b2.setEnabled(true);
   } }
   public static void main(String a[]) {
      new PrimosCT().setVisible(true);
} }
