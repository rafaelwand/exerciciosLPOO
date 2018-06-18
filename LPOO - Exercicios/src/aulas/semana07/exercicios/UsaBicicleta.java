package aulas.semana07.exercicios;
public class UsaBicicleta {
    public static void main(String args[]){
        Bicicleta montainBike = new Bicicleta(){
           void aplicarFreios(int decremento){
		velocidade = velocidade - 2*decremento;
            }
        };
        //Usar
        montainBike.aumentarVelocidade(30);
        montainBike.printStates();
        montainBike.aplicarFreios(4);
        montainBike.printStates();

    }
}
