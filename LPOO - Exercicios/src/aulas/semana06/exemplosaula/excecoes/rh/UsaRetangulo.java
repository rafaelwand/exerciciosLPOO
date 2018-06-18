/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana06.exemplosaula.excecoes.rh;

/**
 *
 * @author rafae
 */
public class UsaRetangulo {
    
    public static void main(String args[]){
        try{
        Retangulo r = new Retangulo(-3,4);
        System.out.println(r.getArea());
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
    
}
