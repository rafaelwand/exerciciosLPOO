package aulas.semana13.exemplos;

public class TestaThreads2 {
   public static void main(String a[]) throws InterruptedException {
      System.out.println("Inicio: main");
      MinhaThread3[] arrayThreads = new MinhaThread3[3];
      for(int i=0;i<arrayThreads.length;i++){
          arrayThreads[i] = new MinhaThread3();
          arrayThreads[i].setName("T"+i);
          arrayThreads[i].start();
      }
       for (MinhaThread3 arrayThread : arrayThreads) {
           arrayThread.join();
       }
      System.out.println("Fim: main");
} }
class MinhaThread3 extends Thread {
   @Override
   public void run() {
      System.out.println("Inicio: "+getName());
      for (int i=0; i<2; i++)
         System.out.println(i+"-"+getName());
      System.out.println("Fim: "+getName());
} }
