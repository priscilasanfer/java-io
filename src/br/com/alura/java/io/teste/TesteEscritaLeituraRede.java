package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteEscritaLeituraRede {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket();

        InputStream fis = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream();
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
