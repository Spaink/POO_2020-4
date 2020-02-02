package aula10.as08b.exercicio04;

public class Crocodilo extends Animal {

	public Crocodilo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Crocodilo emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Crocodilo correndo");

	}
	
}
