/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.testeprova;


/**
 *
 * @author Rafael
 */
class Juliana {
	public void imprime () {
		System.out.println ("Fernanda");
	}
	public void imprime (String s) {
		System.out.println ("Maria "+s);
	}
        public void imprime (String s, boolean g){
            System.out.println(s);
        }
}

class Rafael extends Juliana {
	public void imprime () {
		System.out.println ("Rafael");
	}
}
class Paula extends Juliana {
	public void imprime () {
                super.imprime("Fernanda");
	}
}
public class Questao8
{
	public static void main (String args[])
	{
		Juliana obj1 = new Rafael();
		obj1.imprime();
		Rafael obj2 = (Rafael) obj1;
		obj2.imprime("Joao",true);
		Juliana obj3 = new Paula();
		obj3.imprime();
	}
}

