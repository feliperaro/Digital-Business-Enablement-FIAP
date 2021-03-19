package br.com.fiap.loja;

import java.math.BigDecimal;

public class Pedido {

	private BigDecimal valor;
	private int quantidadeDeItens;
	
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.quantidadeDeItens = 1;
	}
	
	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		super();
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}	
}
