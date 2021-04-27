package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.exception.SaldoInsuficienteException;
import br.com.bytebank.banco.exception.SaldoInsuficienteExceptionChecked;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123,321);

        conta.deposita(200);
       //tratando a exceção lançada.
        try{
            conta.saca(300);
        }catch(SaldoInsuficienteExceptionChecked ex){
            System.out.println("Saldo insuficiente, digite outro valor!");
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
