package aulas.semana13.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ThreadInfo extends JFrame {
   private ThreadMonitor monitor;
   private JButton bNew, bRefresh;
   private int gruposCriados = 0;
   public ThreadInfo() {
      super("ThreadInfo");
      Container cp = getContentPane();
      monitor = ThreadMonitor.getInstance();
      monitor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      cp.add(monitor, "Center");
      bNew = new JButton("Novo Grupo");
      bRefresh = new JButton("Atualizar");
      JPanel pAux1 = new JPanel(new GridLayout(1, 2, 4, 4));
      pAux1.add(bNew);
      pAux1.add(bRefresh);
      JPanel pAux2 = new JPanel();
      pAux2.add(pAux1);
      cp.add(pAux2, "South");
      bNew.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         criaGrupo();
      } } );
      // processador de eventos do bot�o de atualiza��o
      ActionListener al = new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // atualiza monitor de threads
            monitor.refresh();
            Toolkit.getDefaultToolkit().beep();
      } };
      bRefresh.addActionListener(al);
      // ativa Timer para atualiza��o autom�tica
      new Timer(30000, al).start();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
   }
   public void criaGrupo() {
      // determina grupo raiz
      Thread threadMain = Thread.currentThread();
      ThreadGroup grupoRaiz = threadMain.getThreadGroup().getParent();
      // cria grupo extra na raiz
      ThreadGroup newGroup = new ThreadGroup(grupoRaiz, "Extra-"+gruposCriados++);
      newGroup.setDaemon(true); // ajusta o grupo para auto-remo��o quando vazio
      // adiciona algumas EmptyThreads ao grupo
      int quant = (int)(Math.random()*10);
      for(int i=0; i<quant; i++) {
         new EmptyThread(newGroup, "EmptyThread-"+i).start();
      }
      bRefresh.doClick();
   }
   private class EmptyThread extends Thread {
      public EmptyThread(ThreadGroup group, String name) {
         super(group, name);
      }
      public void run() {
         int time = (int)(Math.random()*120);
         for(int i=0; i<time; i++) {
            try {  sleep(1000); }
            catch (InterruptedException ie) { }
   } } }
   public static void main(String a[]) {
      new ThreadInfo().setVisible(true);
} }
