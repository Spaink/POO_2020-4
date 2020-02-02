package aula10.as08b.exercicio03;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo!!!");

	}
	
	public void correr() {
		System.out.println("O cachorro  está correndo.");
	}

}
