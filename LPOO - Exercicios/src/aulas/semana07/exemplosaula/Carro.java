package aulas.semana07.exemplosaula;
class Carro {
    public void acelerar(){
        System.out.println("100km/h");
    }
}
class Gol2 {
    Carro car = new Carro(){
        public void acelerar(){
            System.out.println("50km/h");
        }
        public void frear(){
            System.out.println("50km/h");
        }
    };

    public static void main(String args[]){
        Gol2 gol = new Gol2();
        gol.car.acelerar();
        //gol.car.frear();
    }
}