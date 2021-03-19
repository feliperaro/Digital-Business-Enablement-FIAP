package br.com.fiap.loja.imposto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class TestaImposto {

	public static void main(String[] args) {
		CalculadoraDeImposto calculadoraDeImposto = 
				new CalculadoraDeImposto(new ISS());
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		// trocar a estratégia 
		calculadoraDeImposto.setImposto(new ICMS());
		imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		calculadoraDeImposto.setImposto(new IPI());
		imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
	}
}
