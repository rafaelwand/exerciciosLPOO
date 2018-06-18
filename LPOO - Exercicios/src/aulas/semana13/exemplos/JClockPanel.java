package aulas.semana13.exemplos;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
public class JClockPanel extends JPanel implements Runnable {
   private Thread interna = null;
   private boolean stop = false;
   private SimpleDateFormat sdf;
   private JLabel lTime;
   public String format = "E dd/MM/yyyy HH:mm:ss";
   public JClockPanel() {
      super.add(lTime = new JLabel(format));
      sdf = new SimpleDateFormat(format);
   }
   public void start() {
      if (interna==null) { // cria e inicia thread se necess�rio
         interna = new Thread(this, "Relógio");
         interna.start();
   } }
   public void stop() {
      stop = true; // para thread
      interna = null; // indica necessidade de nova  thread
   }
   public void run() { // código executado como thread
      Thread corrente = Thread.currentThread();
      // só executa se for a thread corrente
      while(!stop) {
         repaint();
         try {
            Thread.sleep(1000); // um segundo de pausa
            lTime.setText(sdf.format(new Date()));
         } catch (InterruptedException e) {}
} } }
