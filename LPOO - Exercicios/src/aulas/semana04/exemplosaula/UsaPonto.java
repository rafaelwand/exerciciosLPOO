/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana04.exemplosaula;

/**
 *
 * @author rafae
 */
public class UsaPonto {
    
    public static void main(String args[]){
        Ponto2D p1 = new Ponto2D(2,2);
        Ponto2D p2 = new Ponto2D(5,5);
        double d = p1.distancia(p2);
        
        Ponto2D p3 = p1;
        
        p3.setX(8);
        zeraPonto(p3);
        
        
        double dist = Ponto2D.distanciaEstatica(p1, p3);
        System.out.println(p1.imprime());
        System.out.println(dist);
        
        
        d = p2.distancia(10,40);
        System.out.println(d);
        
    }
    
    public static void zeraPonto(Ponto2D p){
        p=new Ponto2D();
        p.setX(0);
        p.setY(0);
    }
    
}
