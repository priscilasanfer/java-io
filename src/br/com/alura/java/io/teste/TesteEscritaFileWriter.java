package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lorem2.txt");

        fw.write("Teste do fileWriter");
        fw.write(System.lineSeparator());
        fw.write("Teste nova linha");
        fw.close();

    }
}
