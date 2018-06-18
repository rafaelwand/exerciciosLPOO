package aulas.semana13.exemplos.prodcons1;

public class Produtor extends Thread {
   private int quantidade;
   private Deposito deposito;
   public Produtor(int quantidade, Deposito deposito) {
      this.quantidade = quantidade;
      this.deposito = deposito;
   }
   public void run() {
      System.out.println("Produtor iniciado");
      int total = 0;
      for (int i=0; i<quantidade; i++) {
          int valor = (int)(Math.random()*1234);
          deposito.armazenar(valor);
          System.out.println("Produtor armazenou: "+valor);
          total += valor;
      }
      System.out.println("Produtor gerou: "+total);
} }
