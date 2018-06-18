package aulas.semana07.exemplosaula;
public class Externa {
    private int valor;
    public Externa(int valor) { this.valor = valor; }

    public class Aninhada {
        public void exibir() {
            System.out.println("valor = "+ valor);
        }
    }

    public static void main(String[] args){
        Externa ex = new Externa(10);
        Aninhada an = ex.new Aninhada();
        //Aninhada an = new Aninhada();
    }
}

