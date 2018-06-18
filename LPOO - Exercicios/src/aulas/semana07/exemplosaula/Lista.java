package aulas.semana07.exemplosaula;
import java.util.Scanner;

public class Lista {
    public static void main(String arg[]) {
        No lista = null;
        Scanner sc = new Scanner(System.in);
        String aux;
        do {
            System.out.println("Digite uma palavra (<fim> encerra):");
            aux = sc.next();
            if (!aux.equals("<fim>")) {
                No novo = new No(aux, lista);
                lista = novo;
            }
        } while (!aux.equals("<fim>"));
        System.out.println("Lista das Palavras:\n");
        No no = lista;
        while (no!=null) {
            System.out.print(no.nome + " ");
            no = no.proximo;
        }
        System.out.println("<fim>");
    }
    // classe aninhada estatica
    private static class No {
        public String nome;
        public No proximo;
        public No() { this(null, null); }
        public No(String n, No p) { nome = n; proximo = p; }
    }
}