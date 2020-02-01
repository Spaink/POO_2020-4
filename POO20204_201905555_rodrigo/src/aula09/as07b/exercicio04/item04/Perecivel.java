package aula09.as07b.exercicio04.item04;

public class Perecivel extends Produto {
	
	private int quantidAgua;

	public Perecivel(String nome, double preco, int codigo, int quantidAgua) {
		super(nome, preco, codigo);
		this.quantidAgua = quantidAgua;
	}

	public int getQuantidAgua() {
		return quantidAgua;
	}

	public void setQuantidAgua(int quantidAgua) {
		this.quantidAgua = quantidAgua;
	}
	
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append(super.toString());
		bf.append("\n Quantidade de água: " + this.getQuantidAgua());
		return bf.toString();
	}
	
}
