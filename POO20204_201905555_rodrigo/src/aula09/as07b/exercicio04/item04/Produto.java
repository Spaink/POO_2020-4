package aula09.as07b.exercicio04.item04;

public class Produto {
	
	private String nome;
	private double preco;
	private int codigo;
	
	
	public Produto(String nome, double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("\n Nome: " + this.getNome());
		bf.append("\n Preço: " + this.getPreco());
		bf.append("\n Código: " + this.getCodigo());
		return bf.toString();
	}
}
