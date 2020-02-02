package aula10.as08b.exercicio03;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo está emitindo algum som!!!");

	}
	
	public void correr() {
		System.out.println(" O cavalo está correndo.");
	}
	
}
