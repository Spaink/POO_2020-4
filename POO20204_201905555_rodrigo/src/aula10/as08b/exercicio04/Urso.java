package aula10.as08b.exercicio04;

public class Urso extends Animal {

	public Urso(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Urso emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Urso correndo");

	}
}
