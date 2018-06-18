package aulas.semana13.exemplos;

public class Corredor extends Thread {
   public long distancia = 0L;
   private long max;
   public Corredor (long max) {
      this.max = max;
   }
   public void run() {
      while (distancia < max)
          distancia++;
} }
