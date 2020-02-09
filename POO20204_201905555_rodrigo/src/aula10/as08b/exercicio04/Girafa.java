package aula10.as08b.exercicio04;

public class Girafa extends Animal {

	public Girafa(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Girafa emitindo som");

	}

	@Override
	public void correr() {
		System.out.println("Girafa correndo");
	}
	
	public String som() {
		return "Girafa emitindo som";
	}

}
