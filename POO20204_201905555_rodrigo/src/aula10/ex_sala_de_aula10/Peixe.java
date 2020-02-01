package aula10.ex_sala_de_aula10;

public class Peixe extends Animal {

	public Peixe(String nome) {
		super(nome);
	}

	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("Movimento do Peixe: " + this.getNome());
	}
	
	public void nadar() {
		System.out.println("Sou um " + this.getClass().getSimpleName() + " e estou nadando!!!");
	}
}
