/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.usaclasses;
import A02_1_oo_i.bicicleta.Bicicleta;
import A02_1_oo_i.bicicleta.MarchaException;
import A02_1_oo_i.bicicleta.RpmException;
import A02_1_oo_i.bicicleta.VelocidadeException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class UsaBicicleta {
    public static void main(String[] args){
        try{
        System.out.println("Insira os valores da bicicleta (Velocidade, Marcha, RPM)");
        Scanner sc = new Scanner(System.in);
        int velocidade=sc.nextInt();
        int marcha=sc.nextInt();
        int rpm = sc.nextInt();
        Bicicleta bc = new Bicicleta(velocidade,marcha,rpm);
        System.out.println(bc.toString());
        }
        catch(MarchaException marchaex){
            System.out.println(marchaex.getMessage());
        }
        catch(RpmException rpmex){
            System.out.println(rpmex.getMessage());
        }
        catch(VelocidadeException velex){
            System.out.println(velex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Erro de entrada. Aceita somente inteiros.");
        }
    }
}
