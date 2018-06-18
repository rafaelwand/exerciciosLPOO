/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class RH {

    public void demite(Funcionario f){
        System.out.println(f.mostraNome());
    }

    public static void main(String[] args){
        Gerente joao = new Gerente();
        Funcionario joao1 = joao;
        joao1=new Gerente();
        //joao.getNomeGerente();
        RH rh1 = new RH();
        rh1.demite(joao);
    }

}
