package aulas.semana05.exemplosaula;
import java.util.Scanner;
public class UsaConversores {

    public static void main(String args[]) {
        //prepara Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite temperatura Celsius: ");
        //lê temperatura Celsius
        double tempC = sc.nextDouble();
        //cria conversor Celsius para Kelvin, exibe info e efetua conversão
        CelsiusKelvin ck = new CelsiusKelvin();
        System.out.println("ck:" + ck); //ATENCAO: uso implicito de toString()
        double tempK = ck.converter(tempC);
        //resultado
        System.out.println("tempK = " + tempK + "K");
        //cria conversor Kelvin para Celsius, exibe info e faz conversão
        KelvinCelsius kc = new KelvinCelsius();
        System.out.println("kc: " + kc);
        System.out.println("tempC = " + kc.converter(tempK) + "C");
    }
}
