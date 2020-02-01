package aula09.as07b.exercicio04.item02;

public class Produtos {
	
	private int codigo;
	private double preco;
	private int quantidade;
	
	public Produtos(int codigo, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void dadosPedido() {
		System.out.println("\nCódigo: " + this.getCodigo());
		System.out.println("\nPreço: " + this.getPreco());
		System.out.println("\nQuantidade: " + this.getQuantidade());
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nCódigo: " + this.getCodigo());
		sb.append("\nPreço: " + this.getPreco());
		sb.append("\nQuantidade: " + this.getQuantidade());
		return sb.toString();
	}
	
}
