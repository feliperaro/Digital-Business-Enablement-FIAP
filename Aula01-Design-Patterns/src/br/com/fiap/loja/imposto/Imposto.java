package br.com.fiap.loja.imposto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public interface Imposto {

	public BigDecimal calcular(Pedido pedido);
		
}
