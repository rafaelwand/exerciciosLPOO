package aulas.semana14.exemplos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class LeLinha {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //InputStream is = new FileInputStream("./src/aulas/semana14/exemplos/arquivUTF8.txt");
        InputStream is = new FileInputStream("./src/aulas/semana14/exemplos/arquivUTF8.txt");
        Reader isr = new InputStreamReader(is,"UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        //Lê todas as linhas do teclado
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
    }
}
