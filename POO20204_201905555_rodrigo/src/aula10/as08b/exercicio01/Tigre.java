package aula10.as08b.exercicio01;

public class Tigre extends Animal {

	public Tigre(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Tigre emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Tigre correndo");

	}
	
}
