/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana13.exemplos;

/**
 *
 * @author Rafael
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        HelloRunnable hello = new HelloRunnable();
        Thread threadHello = new Thread(hello);
        threadHello.start();
        //(new Thread(new HelloRunnable())).start();
    }
}
