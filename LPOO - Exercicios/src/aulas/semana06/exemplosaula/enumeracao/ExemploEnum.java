/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana06.exemplosaula.enumeracao;

/**
 *
 * @author Rafael
 */
public class ExemploEnum {

    public enum Opcoes {

        COMPACTAR, DESCOMPACTAR
    };

    public static void main(String a[]) {
        for (Opcoes o : Opcoes.values()) {
            System.out.println(o);
            switch (o) {
                case COMPACTAR: {
                    System.out.println(o);
                    System.out.println("Opcao de compactacao impressa.");
                    break;
                }
                case DESCOMPACTAR: {
                    System.out.println(o);
                    System.out.println("Opcao de descompactacao impressa.");
                    break;
                }
            }
        }
        System.out.println("\nOutros testes: ");
        Opcoes o2 = Opcoes.valueOf("DESCOMPACTAR");
        System.out.println(o2.toString());
        o2 = Opcoes.valueOf("COMPACTAR");
        System.out.println(o2);
        System.out.println("Ordinal: " + o2.ordinal());
        System.out.println("Name: " + o2.name());
    }
}
