package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteTempoDeExecucao {
    public static void main(String[] args) throws IOException {
        long init = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Tempo de escrita");
        bw.newLine();
        bw.write("Tempo de escrita");

        bw.close();

        long fim = System.currentTimeMillis();

        System.out.println("passaram " + ( fim - init) + " milissegundos");
    }
}
