package aula10.as08b.exercicio04;

public class Leao extends Animal {

	public Leao(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Leão emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Leão correndo");

	}

}
