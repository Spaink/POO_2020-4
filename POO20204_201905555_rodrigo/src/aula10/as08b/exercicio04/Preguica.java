package aula10.as08b.exercicio04;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a est� emitindo algum som");

	}
	
	public void correr() {
		System.out.println("A pregui�a est� correndo");
	}
	
	
	public void subir() {
		System.out.println("A pregui�a est� subindo na �rvore");
	}
	
	public String som() {
		return "Pregui�a emitindo som";
	}
}
