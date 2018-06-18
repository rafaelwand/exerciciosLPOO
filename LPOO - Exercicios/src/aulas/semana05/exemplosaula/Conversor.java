package aulas.semana05.exemplosaula;
public class Conversor {
    protected double dblProporcao, dblLinear;

    public Conversor (double p_Prop, double p_Lin)
    {
        this.dblProporcao = p_Prop;
        this.dblLinear = p_Lin;
    }

    public double getProp() {
        return dblProporcao;
    }

    public double getLin() {
        return dblLinear;
    }

    public double converter(double p_Valor) {
        return p_Valor * dblProporcao + dblLinear;
    }

    public String toString() {
        return "Conversor [dblProporcao=" + dblProporcao + ",dblLinear=" + dblLinear + "]";
    }
}
