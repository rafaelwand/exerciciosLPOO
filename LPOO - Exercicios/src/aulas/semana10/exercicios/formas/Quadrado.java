package aulas.semana10.exercicios.formas;
public class Quadrado implements Superficie{
    private double lado;

    public Quadrado(double lado){
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area(){
        return lado*lado;
    }

}
