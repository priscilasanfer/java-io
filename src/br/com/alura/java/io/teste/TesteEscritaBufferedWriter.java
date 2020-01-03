package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaBufferedWriter {
    public static void main(String[] args) throws IOException {
    // Fluxo escrita num arquivo

//        FileOutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


//      Para ter acesso ao método newLine, você pode voltar a utilizar o BufferedWriter para a escrita no arquivo, passando para ele o FileWriter
        BufferedWriter bw = new BufferedWriter( new FileWriter("lorem4.txt"));

        bw.write("Teste de escrita em arquivo");
        bw.newLine();
        bw.newLine();
        bw.write("Finalizando a escrita no arquivo");

        bw.close();




    }
}
