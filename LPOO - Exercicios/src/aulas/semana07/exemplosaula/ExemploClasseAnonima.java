package aulas.semana07.exemplosaula;
public class ExemploClasseAnonima {
   public static void main(String[] args) {
      Evento ev1 = new ImplementaEvento();
     acao(ev1);

     //acao(new Evento());
    Evento  ev2 = new Evento() {
         public void clicar() {
            System.out.println("clicou");
         }
         public void arrastar() {
            System.out.println("arrastou");
         }
      };
      acao(new ImplementaEvento());

       acao( new Evento() {
         public void clicar() {
            System.out.println("clicou");
         }
         public void arrastar() {
            System.out.println("arrastou");
         }
      });
   }
   public static void acao(Evento e) {
      e.clicar();
      e.arrastar();
   }
}
interface Evento {
   public void clicar();
   public void arrastar();
}

