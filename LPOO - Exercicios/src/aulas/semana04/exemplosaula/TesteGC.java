/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana04.exemplosaula;

/**
 *
 * @author Rafael
 */
public class TesteGC {
	public static void main (String args[]) throws InterruptedException {
		System.out.println ("Instancias = " + Objeto.getInstancias());
		Objeto o = null;
                for (int i = 0; i < 10; i ++){
			o = new Objeto ();
		}
		System.out.println ("Instancias = " + Objeto.getInstancias());
		System.gc();
                Thread.sleep(1000);
		System.out.println ("Instancias = " + Objeto.getInstancias());
	}
}

