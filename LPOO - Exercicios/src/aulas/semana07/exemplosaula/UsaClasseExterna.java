package aulas.semana07.exemplosaula;

public class UsaClasseExterna {

    public static void main(String args[]) {
// instanciação da classe externa
        Externa externa = new Externa(10);
// instanciação da classe aninhada
        Externa.Aninhada aninhada = externa.new Aninhada();
        aninhada.exibir();
    }

}
