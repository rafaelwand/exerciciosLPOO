/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.testeprova;

/**
 *
 * @author Rafael
 */
public class UsaAutomovel {
    public static void main(String[] args){
    AutomovelImpl carro = new AutomovelImpl();
    carro.setVelocidade(10,1);
    System.out.println("Velocidade do carro = "+carro.getVelocidade());
    carro.setVelocidade(20);
    System.out.println("Velocidade do carro = "+carro.getVelocidade());
    }

}
