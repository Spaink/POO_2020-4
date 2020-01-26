package aula04.as04b.exercicio01.b;

public class Departamento {
	
	private String nome;
	private String sigla;
	
	public Departamento(String n, String sg){
		this.nome = n;
		this.sigla = sg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
