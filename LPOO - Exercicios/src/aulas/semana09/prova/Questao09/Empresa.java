/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana09.prova.Questao09;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Empresa {
    private Funcionario[] funcionarios;

    public Empresa(int numFuncionarios){
        funcionarios= new Funcionario[numFuncionarios];
    }
    public void incluiFuncionario(Funcionario funcionario,int posicao){
        funcionarios[posicao]=funcionario;
    }

    public void imprimeListaFuncionarios(){
        for(Funcionario fu:funcionarios){
            System.out.println(fu.toString());
        }
    }

    public static void main(String[] args){
        System.out.print("Quantos funcionarios deseja incluir?");
        Scanner sc = new Scanner(System.in);
        int numFuncionarios=sc.nextInt();
        Empresa empresa=new Empresa(numFuncionarios);
        for(int i=0;i<numFuncionarios;i++){
            System.out.print("Insira o nome do funcionário "+(i+1)+":");
            String nomeFuncionario = sc.next();
            System.out.print("Insira o rg do funcionário "+(i+1)+":");
            String rgFuncionario = sc.next();
            System.out.print("Insira o salario do funcionário "+(i+1)+":");
            double salario = sc.nextDouble();
            //empresa.incluiFuncionario(new Funcionario(nomeFuncionario,salario,rgFuncionario), i);
        }
        System.out.println("----Lista de Funcionários----");
        empresa.imprimeListaFuncionarios();
    }

}
