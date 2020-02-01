package aula10.ex_sala_de_aula10;

public class Ave extends Animal {

	public Ave(String nome) {
		super(nome);
	}
	
	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("Movimento da Ave: " + this.getNome());
	}

}
