package br.com.fiap.loja;

@SuppressWarnings("serial")
public class StateException extends RuntimeException {

	public StateException(String string) {
		System.out.println(string);
	}

}
