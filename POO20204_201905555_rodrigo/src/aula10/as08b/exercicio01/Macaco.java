package aula10.as08b.exercicio01;

public class Macaco extends Animal {

	public Macaco(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Macaco emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Macaco correndo");

	}

}
