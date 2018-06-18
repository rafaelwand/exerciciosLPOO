package aulas.semana14.exemplos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
public class LeCaracter {

    public static void main(String[] args) throws IOException {
        //InputStream is = new FileInputStream("./src/aulas/semana14/exemplos/arquivUTF8.txt");
        InputStream is = new FileInputStream("./src/aulas/semana14/exemplos/arquivoEscrita3.txt");
        //InputStreamReader isr = new InputStreamReader(is,"ASCII");
        Reader isr = new InputStreamReader(is,"UTF-8");
        //System.out.println(isr.getEncoding());
        int b = isr.read();
        while(b!=-1){
            System.out.println(Integer.toHexString(b)+ " " +(char)b + " " + b);
            b= isr.read();           
        }

        
        
    }
}
