package aula09.as07b.exercicio01.interfaces;

public class Empregado implements Modelo {

	private String codigo;
	private String nome;
	private int idade;
	

	public Empregado(String codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void imprimir() {
		System.out.println(toString());
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Título do Projeto: " + this.titulo());
		sb.append("\nCódigo: " + this.getCodigo());
		sb.append("\nNome: " + this.getNome());
		sb.append("\nIdade: " + this.getIdade() + "\n");
		return sb.toString();
	}

}
