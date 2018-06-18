package aulas.semana07.exemplosaula;
public class OutraExterna {
    private static int valor;
    private int valorNaoEstatico;

    public static class AninhadaEstatica {
        public void exibir() {
            System.out.println("valor = "+ valor);
            //System.out.println("Valor não estático = "+valorNaoEstatico)
       }
    }
}

