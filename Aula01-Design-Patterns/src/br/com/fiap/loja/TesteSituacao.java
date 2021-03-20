package br.com.fiap.loja;

import java.math.BigDecimal;

public class TesteSituacao {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("100"));
		pedido.handler.subscribe(new EmailListener());
		
//		pedido.abrirChamado();
		
		System.out.println(pedido.getSituacao());
		
		pedido.pagar();
		System.out.println(pedido.getSituacao());
		
		pedido.entregar();
		System.out.println(pedido.getSituacao());
		
//		pedido.pagar();
		System.out.println(pedido.getSituacao());
		
	}
}