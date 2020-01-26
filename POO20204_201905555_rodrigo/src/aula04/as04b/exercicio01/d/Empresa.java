package aula04.as04b.exercicio01.d;

public class Empresa {
	
	private String cnpj;
	private String razaoSocial;
	private Endereco end;
	
	public Empresa(String cnpj, String razaoSocial, Endereco end) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.end = end;
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

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	
}
