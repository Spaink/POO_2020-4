package aula09.as07b.exercicio04.item01;

public class Livros {
	
	private int codigo;
	private String titulo;
	private Editora editora;
	
	public Livros(int codigo, String titulo, Editora editora) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public String toString(){
		StringBuffer bf = new StringBuffer();
		bf.append("\n Código: " + this.getCodigo());
		bf.append("\n Título: " + this.getTitulo());
		bf.append("\n Editora: " + this.getEditora().getNome());
		return bf.toString();
	}
	
}
