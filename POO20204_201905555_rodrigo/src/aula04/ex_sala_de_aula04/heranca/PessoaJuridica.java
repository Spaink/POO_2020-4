package aula04.ex_sala_de_aula04.heranca;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial){
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCNPJ da Pessoa Jurídica: " + this.getCnpj());
		sb.append("\nRazão Social da Pessoa Jurídica: " + this.getRazaoSocial());
		return sb.toString();
	}
}
