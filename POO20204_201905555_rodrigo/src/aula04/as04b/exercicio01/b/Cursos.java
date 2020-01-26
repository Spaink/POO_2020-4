package aula04.as04b.exercicio01.b;

public class Cursos {
	
	private String nome;
	private String sigla;
	private Departamento dp;
	
	public Cursos(String n, String sg, Departamento dp) {
		this.nome = n;
		this.sigla = sg;
		this.dp = dp;
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

	public Departamento getDp() {
		return dp;
	}

	public void setDp(Departamento dp) {
		this.dp = dp;
	}
	
	
}
