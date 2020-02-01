package aula09.as07b.exercicio03;

public class ObraDeArte02 {
	
	private String titulo;
	private double preco;
	private String dataCriacao;
	private String situacao;
	private String material;
	private Artista02 artista;
	
	public ObraDeArte02(String titulo, double preco, String dataCriacao, String situacao, String material,
			Artista02 artista) {
		this.titulo = titulo;
		this.preco = preco;
		this.dataCriacao = dataCriacao;
		this.situacao = situacao;
		this.material = material;
		this.artista = artista;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Artista02 getArtista() {
		return artista;
	}

	public void setArtista(Artista02 artista) {
		this.artista = artista;
	}
	
	public void exibeObra() {
		System.out.println(toString());
	}
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nTítulo: " + this.getTitulo() );
		sb.append("\nData da Criação: " + this.getDataCriacao() );
		sb.append("\nSituação: " + this.getSituacao() );
		sb.append("\nMaterial: " + this.getMaterial() );
		sb.append("\nArtista: " + this.getArtista().getNome());
		return sb.toString();
	}
}
