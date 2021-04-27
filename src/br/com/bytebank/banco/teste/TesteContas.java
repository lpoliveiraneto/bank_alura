package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.exception.SaldoInsuficienteExceptionChecked;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		try {
			cc.transfere(10.0, cp);
		}catch (SaldoInsuficienteExceptionChecked ex){
			System.out.println("Valor insuficente para transferência. Digite outro valor");
			System.out.println(ex.getMessage());
		}

		
		System.out.println("CC: "+cc.getSaldo());
		System.out.println("CP: "+cp.getSaldo());
		System.out.println(cc.toString());
		System.out.println(cp.toString());
	}
}
