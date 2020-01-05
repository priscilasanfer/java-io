package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        String nome = "Priscila Ferreira";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
        oos.writeObject(nome);
        oos.close();
    }
}
