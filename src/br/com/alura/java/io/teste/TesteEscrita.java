package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
    // Fluxo escrita num arquivo

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos); // Transformar os  caracteres em bytes
        BufferedWriter bw = new BufferedWriter(osw); // junta varios caracteres que estao dentro de uma linha e le linha por linha

        bw.write("Teste de escrita em arquivo");
        bw.newLine();
        bw.newLine();
        bw.write("Finalizando a escrita no arquivo");

        bw.close();
    }
}
