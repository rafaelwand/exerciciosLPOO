/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula;

/**
 *
 * @author Rafael
 */
public class AvaliaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();

        Object c = b;

        System.out.println("a==b "+a.equals(b));
        System.out.println("b==a "+b.equals(a));
        System.out.println("c==b "+c.equals(b));
        System.out.println("b==c "+b.equals(c));
        System.out.println("a==c "+a.equals(c));
        System.out.println("c==a "+c.equals(a));

        System.out.println("hashcode a="+a.hashCode());
        System.out.println("hashcode b="+b.hashCode());
        System.out.println("hashcode c="+c.hashCode());

    }
}
