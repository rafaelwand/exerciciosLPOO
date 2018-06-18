/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A02_1_oo_i.bicicleta;

/**
 *
 * @author Rafael
 */
public class RpmException extends Exception{
    public RpmException(){
        super("O RPM não pode ser negativo");
    }

}
