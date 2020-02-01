package aula09.as07b.exercicio01.classeabstrata;

public class Empregado  extends Modelo{
	
	private String codigo;
	private String nome;
	private int idade;
	

	public Empregado(String tituloDoProjeto,String codigo, String nome, int idade) {
		super(tituloDoProjeto);
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
		System.out.println("Título do Projeto: " + this.getTituloDoProjeto());
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade() + "\n");	
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nTítulo do Projeto: " + this.getTituloDoProjeto());
		sb.append("\nCódigo: " + this.getCodigo());
		sb.append("\nNome: " + this.getNome());
		sb.append("\nIdade: " + this.getIdade() + "\n");
		return sb.toString();
	}
	
}
