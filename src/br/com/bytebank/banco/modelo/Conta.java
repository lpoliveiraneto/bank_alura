package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.exception.SaldoInsuficienteException;
import br.com.bytebank.banco.exception.SaldoInsuficienteExceptionChecked;

/**
 * @author Oliveira Neto
 *
 * Essa classe e o molde para todas outras contra que serao criadas
 * Exemplo:  Conta Corrente extende de Conta
 * Conta e uma classe abstrata para que ela nao possa ser instanciada
 * e apenas extendida para que for utilizar ela.
 */
public abstract class Conta implements Comparable<Conta>{
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * Metódo que deverá ser implementado por quem extender
	 *
	 * @param valor
	 */
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteExceptionChecked {
		if(this.saldo < valor) {
			//throw new SaldoInsuficienteException("Saldo insuficiente: " + this.saldo +", valor: " + valor);
			throw  new SaldoInsuficienteExceptionChecked("Saldo insuficiente: " + this.saldo +", valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExceptionChecked{
		this.saca(valor);
		destino.deposita(valor);

	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
		
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	//sobreescrevendo o método equals da classe object
	@Override
	public boolean equals(Object ref){
		Conta outra = (Conta)ref;

		if(isBoolean(outra)){
			return false;
		}
		return true;
	}

	//fazendo a verificação
	private boolean isBoolean(Conta outra) {
		return this.agencia != outra.agencia || this.numero != outra.numero;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero;
	}

	@Override
	public int compareTo(Conta c1) {
		return Integer.compare(this.agencia, c1.agencia);
	}
}
