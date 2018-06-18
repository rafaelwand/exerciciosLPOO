/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana05.exemplosaula.bicicleta;

/**
 *
 * @author Rafael
 */
public class VelocidadeException extends Exception{
    public VelocidadeException(){
        super("Velocidade inválida. Valores válidos entre 0 e 300.");
    }
}
