package aulas.semana13.exemplos.prodcons2;

public class Deposito {
   private boolean ok = false; // vari�vel sinalizadora (flag)
   private int valor;          // regi�o cr�tica
   public synchronized void armazenar(int valor) {
      // thread espera se valor dispon�vel (ok=true)
      while (ok==true) {
          
         try { wait(); }
         catch (InterruptedException ie) { }
      }
      this.valor = valor;    // armazena valor
      ok = true;             // atualiza flag
      notifyAll();           // notifica demais threads
   }
   public synchronized int retirar() {
      // thread espera se valor indispon�vel (ok=false)
      while (ok==false) {
         try { wait(); }
         catch (InterruptedException ie) { }
      }
      ok = false;             // atualiza flag
      notifyAll();            // notifica demais threads
      return valor;}           // recupera valor
}
