package aula09.as07b.exercicio04.item04;

public class NaoPerecivel extends Produto{
	
	private int temperaturaConservacao;

	public NaoPerecivel(String nome, double preco, int codigo, int temperaturaConservacao) {
		super(nome, preco, codigo);
		this.temperaturaConservacao = temperaturaConservacao;
	}

	public int getTemperaturaConservacao() {
		return temperaturaConservacao;
	}

	public void setTemperaturaConservacao(int temperaturaConservacao) {
		this.temperaturaConservacao = temperaturaConservacao;
	}
	
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append(super.toString());
		bf.append("\n Temperatura de Conservação é: " + this.getTemperaturaConservacao());
		return bf.toString();
	}
	
}
