/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana09.prova;

/**
 *
 * @author Rafael
 */
public class TesteObjetos {

    private Integer x, y;

    public TesteObjetos() throws Exception {
        this(0, 1);
    }

    public TesteObjetos(int x, int y) throws Exception {
        System.out.print("A");
        this.setValores(x, y);
    }

    public void setValores(int x, int y) throws Exception {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        } else {
            throw new Exception("C");
        }
        System.out.print("T");
    }

    public static void main(String args[]) {
        try {
            TesteObjetos obj = new TesteObjetos();
            TesteObjetos obj2 = new TesteObjetos(-1, 3);
            TesteObjetos obj3 = new TesteObjetos(2, 6);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.print("A");
        } finally {
            System.out.print("R");
        }
    }
}
