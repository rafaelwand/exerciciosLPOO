package aulas.semana13.exemplos.prodcons2;

public class Consumidor extends Thread {
   private int quantidade;
   private Deposito deposito;
   public Consumidor(int quantidade, Deposito deposito) {
      this.quantidade = quantidade;
      this.deposito = deposito;
   }
   public void run() {
      System.out.println("Consumidor iniciado");
      int total = 0;
      for (int i=0; i<quantidade; i++) {
         int valor = deposito.retirar();
         System.out.println("Consumidor retirou: "+valor);
         total += valor;
      }
      System.out.println("Consumidor obteve: "+total);
} }
