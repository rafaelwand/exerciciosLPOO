package aulas.semana09.prova;
public class UsaAutomovel {
    public static void main(String[] args){
        Automovel carro = new Celta();
        carro.setVelocidade(10,1);
        System.out.println("Velocidade do carro = "+carro.getVelocidade());
        carro.setVelocidade(20);
        System.out.println("Velocidade do carro = "+carro.getVelocidade());

    }
}
