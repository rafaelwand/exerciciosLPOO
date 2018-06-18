package aulas.semana05.exemplosaula.forma;
public class UsaForma {
	public static void main (String args[]){
		Circunferencia c = new Circunferencia (2);
		System.out.println (c.toString());
		System.out.println ("Area: " + c.area());

		Forma r = new Retangulo (1, 3);

                System.out.println (r.toString());

                Retangulo r1 = (Retangulo)r;

		System.out.println ("Area: " + r.area() + " | Perimetro: " + r1.perimetro());


                System.out.println("Cor da forma r="+r.getCor());
                System.out.println("Cor do retangulo r1="+r1.getCor());
                
                r=new Retangulo(1,3);
                r.setCor("Amarelo");
                System.out.println("Cor da forma r="+r.getCor());
                System.out.println("Cor do retangulo r1="+r1.getCor());

		Triangulo t = new Triangulo (1, 2, 2);
		System.out.println (t.toString());
		System.out.println ("Area: " + t.area());





		//Forma f = new Forma ();
		//Isso não é possível de fazer porque a classe Forma é abstrata!
	}

}
