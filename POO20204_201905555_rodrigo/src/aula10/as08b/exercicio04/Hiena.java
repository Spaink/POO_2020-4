package aula10.as08b.exercicio04;

public class Hiena extends Animal {

	public Hiena(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Hiena emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Hiena correndo");

	}

}
