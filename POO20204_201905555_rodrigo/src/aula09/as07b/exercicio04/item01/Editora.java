package aula09.as07b.exercicio04.item01;

public class Editora {
	
	private String nome;
	private int codigoEditora;
	private String Telefone;
	
	public Editora(String nome, int codigoEditora, String telefone) {
		this.nome = nome;
		this.codigoEditora = codigoEditora;
		this.Telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(int codigoEditora) {
		this.codigoEditora = codigoEditora;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
}
