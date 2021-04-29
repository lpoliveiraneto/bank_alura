package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,11);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,11);
        lista.add(cc3);

        System.out.println(lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println(lista.size());

        //foreach
        for(Conta conta: lista){
            System.out.println(conta);
        }


    }
}
