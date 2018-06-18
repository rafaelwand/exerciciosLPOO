/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.prova01;

class Pai {
	public void imprime () {
		System.out.println ("Henrique");
	}
	public void imprime (String s) {
		System.out.println ("Maria "+s);
	}
        public void imprime (String s, boolean g){
            System.out.println(s);
        }
}

class Filho1 extends Pai {
	public void imprime () {
		System.out.println ("Rafael");
	}
}
class Filho2 extends Pai {
	public void imprime () {
                super.imprime("Fernanda");
	}
}
public class Polimorfismo
{
	public static void main (String args[])
	{
		Pai obj1 = new Filho1();
		obj1.imprime();
		Filho1 obj2 = (Filho1) obj1;
		obj2.imprime("Joao",true);
		Pai obj3 = new Filho2();
		obj3.imprime();
	}
}

