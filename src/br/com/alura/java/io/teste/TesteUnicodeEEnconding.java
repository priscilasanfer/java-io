package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "é";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.print(bytes.length + ", UTF-8, ");
        String sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US ASCIII, ");
        sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);
    }
}
