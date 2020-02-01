package aula10.as08b.exercicio01;

public class Lobo extends Animal {

	public Lobo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Lobo uivando");

	}

	@Override
	public void correr() {
		System.out.println("Lobo correndo");

	}
	
}
