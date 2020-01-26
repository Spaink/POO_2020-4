package aula04.as04b.exercicio01.a;

public class Musicas {
	
	private String nome;
	private int ano;
	private String tipo;
	private Compositores nomeCompositor;
	
	public Musicas(String nome, int ano, String tipo, Compositores nomeCompositor) {
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.nomeCompositor = nomeCompositor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public Compositores getNomeCompositor() {
		return nomeCompositor;
	}

	public void setNomeCompositor(Compositores nomeCompositor) {
		this.nomeCompositor = nomeCompositor;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n Nome da Música: " + this.getNome());
		sb.append("\n Ano: " + this.getAno());
		sb.append("\n Tipo: " + this.getTipo());
		sb.append("\n Nome Compositor: " + this.getNomeCompositor().getNome());
		sb.append("\n Nacionalidade: " + this.getNomeCompositor().getNascionalidade());
		return sb.toString();
	}
	
}
