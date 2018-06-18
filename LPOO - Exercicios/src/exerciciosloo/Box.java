/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo;

/**
 *
 * @author Rafael
 */
public class Box<T> {
    private T t; // T stands for "Type"
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public boolean boxTest(Box<? extends Number> n){
        if(n == null){
            return false;
        }
        return true;

    }


    public static void main(String[] args){
        Box<Number> box = new Box<Number>();
        box.add(new Integer(10)); // OK
        box.add(new Double(10.1)); // OK

        Box<Integer> boxint = new Box<Integer>();
        boxint.boxTest(boxint);


    }
}
