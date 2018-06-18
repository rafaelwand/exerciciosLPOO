/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.formas;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class SomaAreasGenerico {
    public <T extends Superficie> double calculaArea(T array[]){
        double soma=0.0;
        for (T elemento:array){
            soma+=elemento.area();
        }
        return soma;
    }

    public static void main (String[] args){
        Quadrado quad[] = {new Quadrado(2.0), new Quadrado(5.0)};
        Circunferencia circ[] = {new Circunferencia(3.0),new Circunferencia(2.0)};
        SomaAreasGenerico soma = new SomaAreasGenerico();

        System.out.println("Area dos quadradados = "+soma.calculaArea(quad));
        System.out.println("Area das circunferencias = "+soma.calculaArea(circ));

    }
}
