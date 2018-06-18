/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Teste {
    String enunciado;
    String[] opcoes;
    int alternativaCorreta;
    public Teste(String e, String[] opcoes, int correto) {
        enunciado = e;
        this.opcoes = opcoes;
        alternativaCorreta = correto;
    }
    public void show() {
        System.out.println(enunciado);
        for (int i = 0; i < opcoes.length; ++i) {
            System.out.println(opcoes[i]);
        }
        System.out.println(">> " + opcoes[alternativaCorreta]);
    }
    public static void main(String[] args) {
        String s = "Qual e a musica?";
        Teste t = new Teste(s, args, args.length);
        t.show();
    }
}
