package aula11.ex_sala_aula11.singleton;

public class Numeracao {
	private static int seq = 0;
	private int numero;

	public Numeracao() {
		numero = ++seq;
	}

	public String toString() {
		return "Numeração " + numero;
	}
}
