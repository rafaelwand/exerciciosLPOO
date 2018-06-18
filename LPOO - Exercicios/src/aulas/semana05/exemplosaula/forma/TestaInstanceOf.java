package aulas.semana05.exemplosaula.forma;

public class TestaInstanceOf {

    public static void main(String args[]) {
        ///cria triangulo
        Object obj = new Triangulo(1.5, 1.5, 2.0);
        //exige informacao do objeto triangulo
        System.out.println(obj);
        //verifica de quem o objeto é instancia
        System.out.printf("Instancia de Triangulo: %s.\n", obj instanceof Triangulo ? "SIM" : "NAO");
        System.out.printf("Instancia de Retangulo: %s.\n", obj instanceof Retangulo ? "SIM" : "NAO");
        System.out.printf("Instancia de Forma: %s.\n", obj instanceof Forma ? "SIM" : "NAO");
        System.out.printf("Instancia de Object: %s.\n", obj instanceof Object ? "SIM" : "NAO");
        System.out.printf("Instancia de Runnable: %s.\n", obj instanceof Runnable ? "SIM" : "NAO");
    }
}
