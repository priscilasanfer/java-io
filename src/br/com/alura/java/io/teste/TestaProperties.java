package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestaProperties {
    public static void main(String[] args) throws IOException {
        //import deve ser java.util.Properties
        Properties escritaProperties = new Properties();
        escritaProperties.setProperty("login", "alura"); //chave, valor
        escritaProperties.setProperty("senha", "alurapass");
        escritaProperties.setProperty("endereco", "www.alura.com.br");

        escritaProperties.store(new FileWriter("conf.properties"), "algum comentário");

        Properties leituraProperties = new Properties();
        leituraProperties.load(new FileReader("conf.properties"));

        String login = leituraProperties.getProperty("login");
        String senha = leituraProperties.getProperty("senha");
        String endereco = leituraProperties.getProperty("endereco");

        System.out.println(login + ", " + senha  + ", " +  endereco);
    }

}
