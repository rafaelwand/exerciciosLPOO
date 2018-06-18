package aulas.semana09.prova;
class C {
	public void imprime () {
		System.out.println ("Paulo");
	}
	public void imprime (String s) {
		System.out.println ("Luis "+s);
	}
        public void imprime (String s, boolean g){
            System.out.println(s);
        }
}

class D extends C {
	public void imprime () {
		System.out.println ("Carlos");
	}
}
class B extends C {
	public void imprime () {
                super.imprime("Eduardo");
	}
}
public class A1
{
	public static void main (String args[])
	{
		C obj1 = new D();
		obj1.imprime();
		D obj2 = (D) obj1;
		obj2.imprime("Andre",true);
		C obj3 = new B();
		obj3.imprime();
	}
}
