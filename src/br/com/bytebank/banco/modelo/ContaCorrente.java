package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.exception.SaldoInsuficienteExceptionChecked;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteExceptionChecked {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor){
		this.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.01;
	}

	@Override
	public String toString() {
		return "CC-Conta Corrente: " +  super.toString();
	}
}
