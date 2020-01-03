package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {
    // Fluxo escrita num arquivo

//        FileOutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter( new FileWriter("lorem4.txt"));

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Teste de escrita em arquivo");
        ps.println("Teste de escrita em arquivo teste");
        ps.println();
        ps.println();
        ps.println("Finalizando a escrita no arquivo");
        ps.close();




    }
}
