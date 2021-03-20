package br.com.fiap.loja;

public class Cancelado extends Situacao{

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para comercial");
	}

	@Override
	public void reabrir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}

}
