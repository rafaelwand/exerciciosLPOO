package aulas.semana10.exemlos;

public class MaiorS {

    public static void main(String a[]) {
        Integer arrayI[] = {-3, -2, 1, 0, 2, 4, 3, 0};
        Double arrayD[] = {0.0, 0.5, 1.0, 2.0, 1.5, -0.5};
        System.out.println("Integer" + arrayToString(arrayI));
        System.out.println("Maior Integer: " + maior(arrayI));
        System.out.println("Double" + arrayToString(arrayD));
        System.out.println("Maior Double : " + maior(arrayD));
    }

    public static String arrayToString(Object array[]) {
        StringBuffer sb = new StringBuffer("[ ");
        for (Object elemento : array) { // for avançado
            sb.append(elemento + ",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static Integer maior(Integer array[]) {
        Integer maior = array[0];
        for (Integer elemento : array) { // for avançado
            if (maior.compareTo(elemento) < 0) {
                maior = elemento;
            }
        }
        return maior;
    }

    public static Double maior(Double array[]) {
        Double maior = array[0];
        for (Double elemento : array) { // for avançado
            if (maior.compareTo(elemento) < 0) {
                maior = elemento;
            }
        }
        return maior;
    }
}
