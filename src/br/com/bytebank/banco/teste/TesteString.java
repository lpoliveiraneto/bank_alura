package br.com.bytebank.banco.teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        //String é um objeto imutável
        String nome = "Neto";

        //replace ele retorna uma referencia da string alterada
        String outro = nome.replace("N", "O");

        //toLowerCase() retorna uma referencia da string minuscule
        String minuscule = nome.toLowerCase();

        //toUpperCase() retorna uma referencia da string maiúscula
        String maiusculo = nome.toUpperCase();

        System.out.println(outro);

        System.out.println(minuscule);

        System.out.println(maiusculo);

        char c = nome.charAt(0);
        System.out.println(c);

        int pos = nome.indexOf("Neto");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        System.out.println(nome.length());

        String vazio = "        lua vai";
        System.out.println(vazio);
        System.out.println(vazio.isEmpty());

        String outroVazio = vazio.trim();
        System.out.println(outroVazio);
        System.out.println(outroVazio.isEmpty());

        System.out.println(outroVazio.contains(" "));
    }
}
