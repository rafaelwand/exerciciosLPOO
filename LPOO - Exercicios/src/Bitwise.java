/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Bitwise {
	public static void main (String args[])
	{
		byte a = 0x1F, b = 0x10;

		System.out.println ("a = " + a);
		System.out.println ("b = " + b);
		System.out.println ("a & b = " + (a & b));
		System.out.println ("a | b = " + (a | b));
		System.out.println ("a ^ b = " + (a ^ b));
		System.out.println ("~b = " + (~b));
		System.out.println ("a << 2 = " + (a << 2));
		System.out.println ("-a << 4 = " + (-a << 4));
		System.out.println ("-a binario:    " + Integer.toBinaryString(-a));
		System.out.println ("-a<<4 binario: " + Integer.toBinaryString(-a<<4));
                System.out.printf ("%X", (byte)-a);
	}

}
