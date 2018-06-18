/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana06.exemplosaula.excecoes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class UsaRetangulo {

    public static void main(String args[]) {
        try {
            Retangulo ret = null;
            
            ret = new Retangulo(3, 5);
            ret.setTamanho(-3,3);
            System.out.println("Passei aqui!");
            
            System.out.println(ret);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

