package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
    // Fluxo de entrada com um arquivo

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis); // Transformar os bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // junta varios caracteres que estao dentro de uma linha e le linha por linha
        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
