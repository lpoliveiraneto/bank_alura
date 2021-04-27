package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadoDeReferencias;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {
        GuardadoDeReferencias guardadorDeContas = new GuardadoDeReferencias();

        Conta cc = new ContaCorrente(22,11);
        guardadorDeContas.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,11);
        guardadorDeContas.adiciona(cc2);

        Conta cc3 = new ContaCorrente(22,11);
        guardadorDeContas.adiciona(cc3);

        int tamanho = guardadorDeContas.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardadorDeContas.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
