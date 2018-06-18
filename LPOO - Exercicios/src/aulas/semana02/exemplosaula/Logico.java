package aulas.semana02.exemplosaula;

public class Logico
{
	public static void main (String args[])
	{
		boolean a = true;
		boolean b = false;
		int c = 5;
		int d = 5;

		System.out.println ("a = " + a);
		System.out.println ("b = " + b);
		System.out.println ("a && b = " + (a && b));
		System.out.println ("a || b = " + (a || b));
		System.out.println ("!a = " + (!a));
		System.out.println ("(c==d) && b = " + ((c==d) && b));
		System.out.println ("(c==d) || b = " + ((c==d) || b));
		System.out.println ("(c==d) && !b = " + ((c==d) && !b));
	}
}
