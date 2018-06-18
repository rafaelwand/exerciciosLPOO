package aulas.semana07.exemplosaula;
public class Gol extends Carro{
        public void frear(){
            System.out.println("0km/h");
        }
        public void acelerar(){
            System.out.println("50km/h");
        }

        public static void main(String args[]){
            Carro gol = new Gol();
            gol.acelerar();
        }
}
