package aula04.as04b.exercicio03;

public class Cliente {
	
	private String nome;
	private String telefone;
	private int idade;
	private String cpf;
	private String status;
	
	public Cliente(String nome, String telefone, int idade, String cpf, String status) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void desativaCliente() {
		if(getStatus() == "A") {
			String s = "I";
			this.setStatus(s);
		}else {
			System.out.println("O cliente já está inativo");
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n" + this.getNome() + " Tel: " + this.getTelefone() + " - Idade: " + this.getIdade() + " anos - CPF: " + this.getCpf() + " - " + this.getStatus() );
		return sb.toString();
	}
	
	
}
