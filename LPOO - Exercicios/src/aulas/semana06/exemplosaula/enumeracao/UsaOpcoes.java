package aulas.semana06.exemplosaula.enumeracao;

public class UsaOpcoes {
    public static void main(String args[]){
        //Imprime constantes
        for(Opcoes constante: Opcoes.values()){
            System.out.println(constante + " " + constante.getValor() + " " + constante.getNome());
            switch(constante){
                case COMPACTAR:
                    System.out.println("Opcao de compactacao");
                    break;
                case DESCOMPACTAR:
                    System.out.println("Opcao de descompactacao");
                    break;
            }

        }
    }
}
