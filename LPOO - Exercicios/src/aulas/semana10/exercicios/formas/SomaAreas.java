package aulas.semana10.exercicios.formas;
import java.util.ArrayList;

public class SomaAreas {
    public <T extends Superficie> double calculaArea(T array[]){
        double soma=0.0;
        for (T elemento:array){
            soma+=elemento.area();
        }
        return soma;
    }/*
    public double calculaArea(Superficie array[]){
        double soma=0.0;
        for (Superficie elemento:array){
            soma+=elemento.area();
        }
        return soma;
    }*/

 }
