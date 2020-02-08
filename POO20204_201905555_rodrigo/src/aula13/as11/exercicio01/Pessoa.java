package aula13.as11.exercicio01;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float altura;
	private int chave;
	
	public Pessoa(String nome, int idade,float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("\nNome da Pessoa "  + this.getNome());
		sb.append("\nIdade da Pessoa: " + this.getIdade());
		sb.append("\nAltura da Pessoa: " + this.getAltura() + "\n");
		return sb.toString();
		
	}
}
