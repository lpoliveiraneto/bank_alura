package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor){
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "CP-Conta Poupança: " + super.toString();
	}
}
