package Teste;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int peso;
	private int idade;
	private double altura;
	private Endereco end;
	
	public Pessoa( String n, String s, String cpf, int p, int i, double a, Endereco end){
		this.nome = n;
		this.sobrenome = s;
		this.cpf = cpf;
		this.peso = p;
		this.idade = i;
		this.altura = a;
		this.end = end;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Endereco getEnd() {
		return this.end;
	}
	
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nDados da Pessoa:");
		sb.append("\nNome: " + this.getNome());
		sb.append("\nSobrenome: " + this.getSobrenome());
		sb.append("\nCPF: " + this.getCpf());
		sb.append("\nIdade: " + this.getIdade());
		sb.append("\nPeso: " + this.getPeso());
		sb.append("\nAltura: " + this.getAltura());
		sb.append("\nCidade: " + this.getEnd().getCidade() + " - " + this.getEnd().getEstado());
		sb.append("\nBairro: " + this.getEnd().getBairro() + " , Rua: " + this.getEnd().getRua() + "  Quadra: " + this.getEnd().getQuadra() + " Lote: " + this.getEnd().getLote());
		return sb.toString();
		
	}
}
