package aulas.semana13.exemplos;

public class TestaThreads {
   public static void main(String a[]) throws InterruptedException {
      System.out.println("Inicio: main");
      MinhaThread mt1 =  new MinhaThread();
      mt1.setName("T1");
      MinhaThread mt2 = new MinhaThread();
      mt2.setName("T2");
      MinhaThread  mt3 = new MinhaThread();
      mt3.setName("T3");
      mt1.start();
      //mt1.join();
      mt2.start();
      //mt2.join();
      mt3.start();
     // mt3.join();
      
      //
      mt1.join();
      mt2.join();
      mt3.join();
      System.out.println("Fim: main");
      int soma = mt1.getNumero() + mt2.getNumero() + mt3.getNumero();
      System.out.println("Soma:"+soma);
} }


class MinhaThread extends Thread {

    private int numero = 0;

    public void run() {
        System.out.println("Inicio: " + getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "-" + getName());
            numero++;
        }
        System.out.println("Fim: " + getName());
    }
    
    public int getNumero(){
        return numero;
    }

}
