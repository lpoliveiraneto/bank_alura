package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(20, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for(Conta conta : lista){
            System.out.println(conta);
        }

        //ComparatorNumeroDaConta2 comparator = new ComparatorNumeroDaConta2();
        lista.sort( new Comparator<Conta>(){ //classe anônima
            @Override
            public int compare(Conta c1, Conta c2) {
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }
        });

        System.out.println("------------------");

        for(Conta conta : lista){
            System.out.println(conta);
        }

        System.out.println("------------------");

        Comparator comparatorSaldo = new Comparator<Conta>(){
            @Override
            public int compare(Conta c1, Conta c2) {

                if(c1.getSaldo() < c2.getSaldo()){
                    return -1;
                }

                if(c1.getSaldo() > c2.getSaldo()){
                    return 1;
                }

                return 0;
            }
        } ;

        lista.sort(comparatorSaldo);

        for(Conta conta : lista){
            System.out.println(conta);
        }

        System.out.println("------------------");

        ComparatorTitularConta2 comparatorNome = new ComparatorTitularConta2();
        lista.sort(comparatorNome);

        for(Conta conta : lista){
            System.out.println(conta +" Nome: " + conta.getTitular().getNome());
        }

        System.out.println("------------------");
        //Collections.sort(lista);
        lista.sort(null);
        for(Conta conta : lista){
            System.out.println(conta +" Agencia: " + conta.getAgencia());
        }

    }

}

class ComparatorTitularConta2 implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {

        String titular1 = c1.getTitular().getNome();
        String titular2 = c2.getTitular().getNome();

        return titular1.compareTo(titular2);
    }
}