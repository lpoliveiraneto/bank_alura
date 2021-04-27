package br.com.bytebank.banco.exception;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
