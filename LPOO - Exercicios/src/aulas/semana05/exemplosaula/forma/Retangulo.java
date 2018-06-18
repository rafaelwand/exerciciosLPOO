package aulas.semana05.exemplosaula.forma;
public class Retangulo extends Forma {

	public Retangulo (double altura, double largura) {
		super (2); //uso obrigatorio do construtor da super classe
		setMedida (0, altura);
                setMedida (1, largura); //ajusta medidas
	}
	//implementacao do metodo abstrato area
	public double area(){
		return getMedida(0) * getMedida(1);
	}
	//implementacao de metodo especifico desta subclasse
	public double perimetro() {
		return 2 * (getMedida(0)+getMedida(1));
	}
        


}
