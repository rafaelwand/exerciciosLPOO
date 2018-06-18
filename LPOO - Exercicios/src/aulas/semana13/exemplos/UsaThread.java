/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana13.exemplos;

class UsaThread{
	public static void main(String args[]){
		MinhaThread2 m1 = new MinhaThread2();
                		m1.start();
		MinhaThread2 m2 = new MinhaThread2();

		m2.start();
	}
}
