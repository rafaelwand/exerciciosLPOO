package aulas.semana10.exemlos;

public class MaiorSG {

    public static void main(String a[]) {
        Integer arrayI[] = {-3, -2, 1, 0, 2, 4, 3, 0};
        Double arrayD[] = {0.0, 0.5, 1.0, 2.0, 1.5, -0.5};
        System.out.println("Integer" + arrayToString(arrayI));
        System.out.println("Maior Integer: " + maior(arrayI));
        System.out.println("Double" + arrayToString(arrayD));
        System.out.println("Maior Double : " + maior(arrayD));
    }

    public static <T> String arrayToString(T array[]) {
        StringBuffer sb = new StringBuffer("[ ");
        for (T elemento : array) { // for avançado
            sb.append(elemento + ",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static <T extends Comparable> T maior(T array[]) {
        T maior = array[0];
        for (T elemento : array) { // for avançado
            if (maior.compareTo(elemento) < 0) {
                maior = elemento;
            }
        }
        return maior;
    }
}
