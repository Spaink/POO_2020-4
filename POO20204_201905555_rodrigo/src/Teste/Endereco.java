package Teste;

public class Endereco {
	private String cidade;
	private String estado;
	private String rua;
	private String bairro;
	private int quadra;
	private int lote;
	
	public Endereco(String c, String e, String r, String b, int q, int l) {
		this.cidade = c;
		this.estado = e;
		this.rua = r;
		this.bairro = b;
		this.quadra = q;
		this.lote = l;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getQuadra() {
		return this.quadra;
	}
	
	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}
	
	public int getLote() {
		return this.lote;
	}
	
	public void setLote(int lote) {
		this.lote = lote;
	}
}
