package aula10.ex_sala_de_aula10;

public class Animal {
	
	private String nome;
	private int coordenadaX;
	private int coordenadaY;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setCoordenadas(int x, int y) {
		coordenadaX = x;
		coordenadaY = y;
	}
	
	public void mover(int x, int y) {
		System.out.println("Não sei mover");
	}
	
}
