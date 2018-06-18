package aulas.semana06.exemplosaula.excecoes;
public class ExemploEnum1 {

    public enum Opcoes {

        COMPACTAR, DESCOMPACTAR
    };

    public static void main(String a[]) {
        for (Opcoes o : Opcoes.values()) {
            System.out.println(o);
            switch (o) {
                case COMPACTAR: {
                    System.out.println("Opcao de compactacao impressa.");
                    break;
                }
                case DESCOMPACTAR: {
                    System.out.println("Opcao de descompactacao impressa.");
                    break;
                }
            }
        }
        System.out.println("\nOutros testes: ");
        Opcoes o2 = Opcoes.valueOf("DESCOMPACTAR");
        System.out.println(o2.toString());
        o2 = Opcoes.valueOf("COMPACTAR");
        System.out.println(o2.toString());
        System.out.println("Ordinal: " + o2.ordinal());
        System.out.println("Name: " + o2.name());
    }
}

