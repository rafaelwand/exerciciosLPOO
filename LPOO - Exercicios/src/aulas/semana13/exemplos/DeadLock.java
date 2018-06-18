/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana13.exemplos;

/**
 *
 * @author Rafael
 */
public class DeadLock {
  public synchronized void a() {
      b();
      System.out.println("here I am, in a()");
  }
  public synchronized void b() {
      System.out.println("here I am, in b()");
  }

  public static void main(String[] args){
      DeadLock deadLock = new DeadLock();
      System.out.println("Inicio");
      deadLock.a();
      System.out.println("Fim!!");

  }
}

