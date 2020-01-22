package aula04.ex_sala_de_aula04.heranca;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome da Pessoa Física: " + this.getNome());
		sb.append("\nEndereco da Pessoa Física: " + this.getEndereco());
		sb.append("\nTelefone da Pessoa Física: " + this.getTelefone());;
		return sb.toString();
	}
}
