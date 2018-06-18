package aulas.semana14.exemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class EscreverLinha {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream("./src/aulas/semana14/exemplos/arquivoEscrita4.txt");
        Writer osw = new OutputStreamWriter(os,"utf-8");
        //System.out.println(osw.getEncoding());
        BufferedWriter bw = new BufferedWriter(osw);
        for(int i=0;i<10;i++){
            bw.write("Rafael  333");
            bw.newLine();
        }
        bw.write("Wandresen çç ç áá");
        bw.close();
    }
}
