package aulas.semana13.exemplos.prodcons2;

public class ProdCons {
   public static void main(String a[]) {
      Deposito d = new Deposito();
      Produtor p = new Produtor(5, d);
      Consumidor c = new Consumidor(5, d);
      p.start();
      c.start();
} }
