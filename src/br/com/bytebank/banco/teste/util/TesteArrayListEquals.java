package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,11);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,11);
        // O metódo contains possui o metódo equals implementado
        //na classe Conta e não mais na classe Object(padrão)
        boolean existe = lista.contains(cc3);
        //foreach

        System.out.println("Já existe: "+existe);
        for(Conta conta: lista){
            System.out.println(conta);
        }


    }
}
