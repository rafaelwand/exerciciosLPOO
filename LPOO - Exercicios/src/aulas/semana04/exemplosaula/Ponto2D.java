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
public class Ponto2D {
    private double x;
    private double y;
    public final double pi=3.14;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto2D(){
        
    }
    
    public static double distanciaEstatica(Ponto2D p1, Ponto2D p2){
        
        return p1.distancia(p2);
    }
    public static double distanciaEstatica(double x1,double y1, double x2,double y2){
        Ponto2D p1 = new Ponto2D(x1,y1);
        Ponto2D p2 = new Ponto2D(x2,y2);
        
        return p1.distancia(p2);
    }
    
    public double distancia(Ponto2D p){
        double dist = Math.sqrt (Math.pow (x - p.getX(), 2) + Math.pow (y - p.getY(), 2));
        return dist;
    }

    public double distancia(double x, double y){
        Ponto2D p = new Ponto2D(x,y);
        double dist = distancia(p);
        return dist;
    }
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public String imprime(){
        return "P(x="+x+","+"y="+y+")";
    }
    
    
}
