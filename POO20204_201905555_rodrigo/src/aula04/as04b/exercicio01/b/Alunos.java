package aula04.as04b.exercicio01.b;

public class Alunos {
	
	private String nome;
	private int matricula;
	private int ano;
	private Cursos curso;
	
	public Alunos(String n, int m, int a, Cursos c) {
		this.nome = n;
		this.matricula = m;
		this.ano = a;
		this.curso = c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n Nome do Aluno: " + this.getNome());
		sb.append("\n Matrícula: " + this.getMatricula());
		sb.append("\n Ano: " + this.getAno());
		sb.append("\n Curso: " + this.getCurso().getNome() + " - " + this.getCurso().getSigla());	
		sb.append("\n Departamento: " + this.getCurso().getDp().getNome() + " - " + this.getCurso().getDp().getSigla());
		return sb.toString();
	}
}
