package aulas.semana05.exemplosaula.forma;

import java.util.Calendar;

public class UsaPolimorfismo {

    public static void main(String args[]) {
        //cria retângulo de medidas 1.0 x 2.0
        Retangulo r = new Retangulo(1.0, 2.0);

        //exibe área do retângulo
        System.out.println("area = " + r.area());
        System.out.println("perimetro = " + r.perimetro());

        //cria retângulo de medidas 3.0 x 4.0
        Forma f = new Retangulo(1.0, 2.0);

        //exibe area da forma (mesmo resultado acima)
        System.out.println("area = " + f.area());
        //System.out.println ("perimetro = " + f.perimetro());

        Calendar c = Calendar.getInstance();

        System.out.println("Data atual = "+c.getTimeInMillis());
    }
}

