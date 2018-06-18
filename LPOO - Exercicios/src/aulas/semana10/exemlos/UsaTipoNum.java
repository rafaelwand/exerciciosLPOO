package aulas.semana10.exemlos;

import aulas.exemplos.ooII.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaTipoNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TipoNum<String>> lista = new ArrayList();
        //No java 6, ou abaixo:
        //List<TipoNum<String>> lista = new ArrayList<TipoNum<String>>();
        while (true) {
            System.out.print("Digite um nome (. finaliza): ");
            String nome = sc.next();
            if (nome.equals(".")) {
                break;
            }
            System.out.print("Digite um numero: ");
            int id = sc.nextInt();
            lista.add(new TipoNum<String>(id, nome));
        }
        for (TipoNum<String> elem : lista) {
            
            System.out.println("#" + elem.getId() + ": "
                    + elem.getValor());
        }
    }
}
