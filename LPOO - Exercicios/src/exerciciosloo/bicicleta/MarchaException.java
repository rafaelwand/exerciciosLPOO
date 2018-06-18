/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A02_1_oo_i.bicicleta;

/**
 *
 * @author Rafael
 */
public class MarchaException extends Exception{
    public MarchaException(){
        super("Marcha inválida. Deve ser entre 1 e 24. É possível somente o decremento unitário da marcha.");
    }

}
