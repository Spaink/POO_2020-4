package aula09.as07b.exercicio04.item03;

public class Revistas {
	
	private int codigo;
	private String titulo;
	private Edicoes edicoes;
	
	public Revistas(int codigo, String titulo, Edicoes edicoes) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.edicoes = edicoes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Edicoes getEdicoes() {
		return edicoes;
	}

	public void setEdicoes(Edicoes edicoes) {
		this.edicoes = edicoes;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nCódigo: " + this.getCodigo());
		sb.append("\nTitulo: " + this.getTitulo());
		sb.append("\nEdição: " + this.getEdicoes().getNumeroEdicao() + " - " + this.getEdicoes().getDataEdicao());
		return sb.toString();
	}
	
	
}
