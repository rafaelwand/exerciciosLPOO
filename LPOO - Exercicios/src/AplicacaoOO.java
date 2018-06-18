/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
class Henrique {
	public void imprime () {
		System.out.println ("Henrique");
	}
	public void imprime (String s) {
		System.out.println ("Joao "+s);
	}
        public void imprime (String s, boolean g){
            System.out.println(s);
        }
}

class Rafael extends Henrique {
	public void imprime () {
		System.out.println ("Rafael");
	}
}
class Paula extends Henrique {
	public void imprime () {
                super.imprime("Henrique");
	}
}
public class AplicacaoOO
{
	public static void main (String args[])
	{
		Henrique obj1 = new Rafael();
		obj1.imprime();
		Rafael obj2 = (Rafael) obj1;
		obj2.imprime("Maria",true);
		Henrique obj3 = new Paula();
		obj3.imprime();
	}
}
