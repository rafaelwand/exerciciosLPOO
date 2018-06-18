/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo;

/**
 *
 * @author Rafael
 */
public class TesteQuiz {
	public void method(Object o){
		System.out.println("Object Verion");
	}
	public void method(String s){
		System.out.println("String Version");
	}
	public static void main(String args[]){
            if("String".toString() == "String")
	System.out.println("Equal");
else
	System.out.println("Not Equal");
		TesteQuiz question = new TesteQuiz();
		question.method(null);
	}
}
