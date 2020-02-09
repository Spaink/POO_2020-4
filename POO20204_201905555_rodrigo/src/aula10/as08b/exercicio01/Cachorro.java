package aula10.as08b.exercicio01;

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
	
	public String som() {
		return "O cachorro está latindo!!!";
	}
}
