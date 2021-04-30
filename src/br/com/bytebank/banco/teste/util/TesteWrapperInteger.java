package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[4];

        int idade = 29;
        Integer idadeInteger = Integer.valueOf(idade);//autoboxing
        int valor = idadeInteger.intValue();//unboxing

        String numeroString = "11";
        valor = Integer.parseInt(numeroString);

        List<Integer> numeros = new ArrayList<Integer>();
        //autoboxing: primitivo -> wrapper
        //unboxing: wrapper -> primitivo
        numeros.add(idade);

    }

}
