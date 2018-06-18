/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A02_1_oo_i.bicicleta;

/**
 *
 * @author Rafael
 */
public class VelocidadeException extends Exception{
    public VelocidadeException(){
        super("Velocidade inválida. Valores válidos entre 0 e 300.");
    }
}
