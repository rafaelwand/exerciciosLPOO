
package aulas.semana14.exemplos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LeByte {

    public static void main(String[] args) throws IOException {
        //InputStream is = new FileInputStream("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\ExerciciosLOO\\src\\aulas\\semana14\\exemplos\\arquivo.txt");
        //InputStream is = new FileInputStream("./src/aulas/semana14/exemplos/arquivUTF8.txt");
        InputStream is = new FileInputStream("./src/aulas/semana14/exemplos/arquivoEscrita3.txt");
        int b=is.read();
        //System.out.println(b);
        while(b!=-1){
            System.out.println(Integer.toHexString(b)+ " " +(char)b + " " + b + " " + Integer.toBinaryString(b));
            b= is.read();
            
        }
        //int b = is.read();
       /* System.out.println(Integer.toHexString(b)+ " " +(char)b + " " + b);
        b= is.read();
        System.out.println(Integer.toHexString(b)+ " " +(char)b+ " " + b);
        b= is.read();
        System.out.println(Integer.toHexString(b)+ " " +(char)b+ " " + b);
        b= is.read();
        System.out.println(Integer.toHexString(b)+ " " +(char)b+ " " + b);
        b= is.read();
        System.out.println(Integer.toHexString(b)+ " " +(char)b+ " " + b);*/
    }
    
}


