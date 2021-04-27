package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        Object[] referencia = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22,12);
        referencia[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(33,17);
        referencia[1] = cc2;

        Cliente cliente = new Cliente();
        referencia[2] = cliente;

        ContaCorrente ref = (ContaCorrente)referencia[1];

//        System.out.println((ContaCorrente)referencia[1].getNumero());
        System.out.println( ref.getNumero());

    }
}
