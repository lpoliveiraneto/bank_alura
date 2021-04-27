package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TestesTributaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(222, 0111);
		cc.deposita(100);
		
		SeguroDeVida s = new SeguroDeVida();
		
		CalculadorDeImposto c = new CalculadorDeImposto();
		
		c.registra(cc);
		c.registra(s);
		
		System.out.println(c.getTotalImposto());
	}

}
