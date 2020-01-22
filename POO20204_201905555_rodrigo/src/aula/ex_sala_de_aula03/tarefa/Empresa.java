package aula.ex_sala_de_aula03.tarefa;

public class Empresa {
	
	private String nome;
	private String cnpj;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome: " + this.getNome());
		sb.append("\nCNPJ: " + this.getCnpj());
		return sb.toString();
	}
}
