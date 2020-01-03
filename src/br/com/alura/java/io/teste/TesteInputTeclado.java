package br.com.alura.java.io.teste;

import java.io.*;

public class TesteInputTeclado {
    public static void main(String[] args) throws IOException {

        InputStream fis = System.in;
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("lorem3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        bw.close();
        br.close();
    }
}
