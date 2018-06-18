package aulas.semana14.exemplos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeLinhaTeclado {
    public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is,"ISO-8859-1");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        String s2 = br.readLine();
        System.out.println(s);
    }
}
