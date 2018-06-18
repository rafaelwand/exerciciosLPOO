package aulas.semana05.exemplosaula.interfaces;

public class UsaMensagens {

    public static void main(String args[]) {
        MensagemEditavel me = new MensagemEditavel("1 - Construido ME");
        MensagemNaoEditavel mne = new MensagemNaoEditavel("2 - Construido MNE");
        me.imprimir();
        mne.imprimir();
        me.editar("3 - Alterado ME");
        me.imprimir();


        //E possivel instanciar objetos que implementam interfaces em variaveis do tipo da interface. Por exemplo:
        Imprimivel e = new MensagemEditavel("4 - Construido ME em variavel Imprimivel");
        e.imprimir();

        //e.editar("Ola, outra vez, alterado!"); este método não pode ser chamado, pois estou utilizando uma variavel do tipo Imprimivel
        e = new MensagemNaoEditavel("5 - Construido MNE em variavel Imprimivel");
        e.imprimir();
     }
}
