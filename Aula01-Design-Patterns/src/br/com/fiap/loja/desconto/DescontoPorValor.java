package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class DescontoPorValor extends Desconto{

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if(pedido.getValor().compareTo(new BigDecimal("500")) > 0) {
			return pedido.getValor().multiply(new BigDecimal("0.01"));
		}
		
		return proximo.calcular(pedido);
	}

}
