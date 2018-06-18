package aulas.semana06.exemplosaula.excecoes;

public class Retangulo3 {

    private float largura, altura;

    public Retangulo3(float l, float a) throws DimensoesErradasException  {
        setTamanho(l, a);
    }

    public void setTamanho(float l, float a) throws DimensoesErradasException {
        if ((l > 0) && (a > 0)) {
            largura = l;
            altura = a;
        } else {
            throw new DimensoesErradasException();
        }
    }

    public float getLargura() {
        return largura;
    }

    public float getAltura() {
        return altura;
    }
}
