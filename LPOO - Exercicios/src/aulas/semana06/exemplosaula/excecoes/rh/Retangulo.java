package aulas.semana06.exemplosaula.excecoes.rh;

import aulas.semana06.exemplosaula.excecoes.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Retangulo {

    private float largura, altura;

    public Retangulo(float l, float a) throws Exception{
            setTamanho(l, a);
    }

    public void setTamanho(float l, float a) throws Exception{
        if (l > 0 && a > 0) {
            largura = l;
            altura = a;
        } else {
            throw new Exception("Dimensoes invalidas");
        }
    }

    public float getLargura() {
        return largura;
    }

    public float getAltura() {
        return altura;
    }
    
    public float getArea(){
        return altura*largura;
    }

    public String toString(){
        return "Retangulo L="+this.largura +";A="+this.altura;
    }
}
