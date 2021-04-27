package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[6];
        int result = 0;

        for(int i = 0 ; i<idades.length; i++){
            idades[i] = i*i;
        }

        for (int i =0; i<idades.length;i++){
            System.out.println(idades[i]);
        }

    }
}
