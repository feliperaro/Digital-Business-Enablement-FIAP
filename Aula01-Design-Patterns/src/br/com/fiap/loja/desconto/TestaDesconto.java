package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class TestaDesconto {

	public static void main(String[] args) {
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		
		Pedido pedido = new Pedido(new BigDecimal("100"), 10);
		
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		System.out.println(desconto);
	}
}
