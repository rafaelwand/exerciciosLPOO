/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pacoteteste;

/**
 *
 * @author Rafael
 */
public class MinhaClasse {

    public static void main(String[] args){
        MinhaClasse t = new MinhaClasse();
        t.testar("Teste");
        t.testar();
    }

    final public void testar(){
        System.out.println("Testar");
    }

    public void testar(String teste){
        System.out.println(teste);
    }

}
