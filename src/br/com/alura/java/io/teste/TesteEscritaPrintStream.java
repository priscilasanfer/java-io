package br.com.alura.java.io.teste;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("Teste");
        ps.print("Sem pula de linha");

        ps.close();

    }
}
