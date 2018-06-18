/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana05.exemplosaula.bicicleta;

/**
 *
 * @author Rafael
 */
public class RpmException extends Exception{
    public RpmException(){
        super("O RPM não pode ser negativo");
    }

}
