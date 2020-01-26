package aula04.as04b.exercicio01.c;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Endereco end;
	
	public Cliente(String nome, String cpf, Endereco end) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	public String toString() {	
		StringBuffer sb = new StringBuffer();
		sb.append("\n Nome do cliente: " + this.getNome());
		sb.append("\n CPF: " + this.getCpf());
		sb.append("\n Rua: " + this.getEnd().getRua() + ", n° " + this.getEnd().getNumero());
		sb.append("\n Complemento: " + this.getEnd().getComplemento() + ", cep : " + this.getEnd().getCep());
		sb.append("\n Bairro: " + this.getEnd().getBairro());
		sb.append("\n Cidade: " + this.getEnd().getCidade() + " - " + this.getEnd().getEstado());
		return sb.toString();
	}
	
}
