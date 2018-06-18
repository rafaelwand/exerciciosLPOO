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
public class UsaRet2 {
    public static void main(String[] args){
        try {
            // try {
            Retangulo2 ret = new Retangulo2(-1,2);
            System.out.println(ret.getAltura());
            //} catch (Exception ex) {
            //}
        } catch (Exception ex) {
           System.out.println("Ocorreu um erro. Veja a stack trace:");
           // ex.printStackTrace();
            
        }
        
    }
    
}
