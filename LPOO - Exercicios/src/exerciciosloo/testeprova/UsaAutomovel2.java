/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.testeprova;

/**
 *
 * @author Rafael
 */
public class UsaAutomovel2 {

    public static void main(String[] args) {
        AutomovelImpl carro1 = new AutomovelImpl();
        carro1.setVelocidade(100, 2);
        AutomovelImpl carro2 = carro1;
        carro1.setVelocidade(30);
        System.out.println("Velocidade carro 1 = " + carro1.getVelocidade());
        System.out.println("Velocidade carro 2 = " + carro2.getVelocidade());
    }

}
