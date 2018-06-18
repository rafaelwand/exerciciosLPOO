/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana04.exemplosaula;

/**
 *
 * @author Rafael
 */
public class Objeto {
	private static int instancias = 0;
	private int id;

	public Objeto () {
		id = instancias++;
		System.out.println ("Objeto.Objeto() [id=" + id + "]");
	}

	public static int getInstancias () {
		return instancias;
	}

	public int getId () {
		return id;
	}

	protected void finalize () {
		instancias--;
		System.out.println ("Objeto.finalize() [id=" + id + "]");
	}
}
