package aulas.semana14.exemplos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class LeLinha2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/aulas/semana14/exemplos/arquivo.txt"));
        String s = br.readLine();
        //Lê todas as linhas do arquivo
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
    }
}
