package aulas.semana10.exercicios;
//O tipo genérico deve ser declarado depois do nome
public class Pilha<T> {

    private int tamanho;
    private Elemento primeiro;

    private class Elemento {
        private T item;
        private Elemento proximo;
    }

    public Pilha() {
        primeiro = null;
        tamanho = 0;
    }

    public boolean isVazia() {
        return primeiro == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public T getPrimeiro() {
        return primeiro.item;
    }

    public void empilha(T item) {
        Elemento tempPrimeiro = primeiro;
        primeiro = new Elemento();
        primeiro.item = item;
        primeiro.proximo = tempPrimeiro;
        tamanho++;
    }

    public T desempilha() throws Exception {
        if (isVazia()) {
            throw new Exception("Pilha vazia.");
        }
        T item = primeiro.item;
        primeiro = primeiro.proximo;
        tamanho--;
        return item;
    }

    public String toString() {
        String s = "";
        for (Elemento n = primeiro; n != null; n = n.proximo) {
            s = s + n.item;// + ",";
            if (n.proximo != null) {
                s = s + " , ";
            }
        }
        return "[ " + s + " ]";
    }
}
