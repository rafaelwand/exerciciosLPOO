package aulas.semana13.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Corrida extends JFrame implements ActionListener, Runnable {
   private JButton bInicio;
   private JTextField tfPrioridade[];
   private JLabel lDistancia[];
   private Corredor corredor[];
   private Thread monitor;
   public Corrida(int numCorredores) {
      super("Corrida");
      tfPrioridade = new JTextField[numCorredores];
      lDistancia = new JLabel[numCorredores];
      corredor = new Corredor[numCorredores];
      JPanel p = new JPanel(new GridLayout(numCorredores, 3));
      for (int i = 0; i<numCorredores; i++) {
         p.add(new JLabel(i+1+""));
         p.add(tfPrioridade[i] = new JTextField(""+Thread.NORM_PRIORITY));
         p.add(lDistancia[i] = new JLabel("", SwingConstants.RIGHT));
      }
      getContentPane().add(p, "Center");
      p = new JPanel(new FlowLayout());
      p.add(bInicio = new JButton("Início"));
      bInicio.addActionListener(this);
      getContentPane().add(p, "South");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
   }
   public void actionPerformed(ActionEvent e) {
      int prio, maxPrio = Thread.MIN_PRIORITY;
      for(int i=0; i<corredor.length; i++) { // cria e prepara corredores
         corredor[i] = new Corredor(10000000000L);
         maxPrio = prio = Thread.NORM_PRIORITY;
         try { // obt�m prioridade dada pelo usuario
            prio = Integer.parseInt(tfPrioridade[i].getText());
            tfPrioridade[i].setEnabled(false);
         } catch (NumberFormatException nfe) { }
         corredor[i].setPriority(prio);           // ajusta prioridade
         maxPrio = prio>maxPrio ? prio : maxPrio; // obt�m maior prioridade
      }
      monitor = new Thread(this, "Corrida"); // cria monitor
      monitor.setPriority(maxPrio+1);        // ajusta prioridade maior

      for(int i=0; i<corredor.length; i++)   // inicia corredores
         corredor[i].start();
      monitor.start();                       // inicia monitor
   }
   public void run() {
      boolean correndo = true;
      while (correndo) { // monitora enquanto todos est�o �correndo�
         for(int i=0; i<corredor.length; i++) {
            if (!corredor[i].isAlive()) correndo = false;
            lDistancia[i].setText((corredor[i].distancia/10000)+"");
         }
         // d� chance para threads de menor prioridade
         try { Thread.sleep(10); }
         catch (InterruptedException e) { }
      }
      for(int i=0; i<corredor.length; i++) { // finaliza corredores
         corredor[i] = null;
         tfPrioridade[i].setEnabled(true);
   } }
   public static void main(String a[]) throws Exception {
      int corredores = a.length>0 ? Integer.parseInt(a[0]) : 8;
      new Corrida(corredores).setVisible(true);
} }
