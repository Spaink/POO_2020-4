package aula10.ex_sala_de_aula10;

public class Anfibio extends Animal {

	public Anfibio(String nome) {
		super(nome);
	}
	
	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("Movimento do Anfíbio: " + this.getNome());
	}
}
