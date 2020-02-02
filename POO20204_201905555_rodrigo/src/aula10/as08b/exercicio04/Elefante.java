package aula10.as08b.exercicio04;

public class Elefante extends Animal {

	public Elefante(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Elefante emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Elefante correndo");

	}
	
}
