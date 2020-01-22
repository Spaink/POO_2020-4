package aula04.ex_sala_de_aula04.heranca;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String sexo;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil){
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
		
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCPF da Pessoa Física: " + this.getCpf());
		sb.append("\nEstado Civil da Pessoa Física: " + this.getEstadoCivil());
		sb.append("\nSexo da Pessoa Física: " + this.getSexo());
		return sb.toString();
	}	
}

