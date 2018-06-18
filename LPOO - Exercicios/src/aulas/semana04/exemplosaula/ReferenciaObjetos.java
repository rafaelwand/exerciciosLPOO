/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana04.exemplosaula;

/**
 *
 * @author Rafael
 */
public class ReferenciaObjetos {
    public static void main(String[] args){
        String[] students = new String[10];
        String studentName = "Peter Parker";
        String students1 = studentName;
        studentName = "123";

        System.out.println(students1);

    }
}
