package aula04.as04b.exercicio01.d;

public class Empregado {
	
	private String nome;
	private int matricula;
	private Empresa emp;
	
	public Empregado(String nome, int matricula, Empresa emp) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.emp = emp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Empresa getEmp() {
		return emp;
	}

	public void setEmp(Empresa emp) {
		this.emp = emp;
	}
	
	public String toString() {	
		StringBuffer sb = new StringBuffer();
		sb.append("\n##################***Dados do Empregado***##################" );
		sb.append("\n Nome do Empregado: " + this.getNome());
		sb.append("\n Matrícula: " + this.getMatricula());
		sb.append("\n------------------------------------------------------------" );
		sb.append("\n#########***Dados da Empresa***#################" );
		sb.append("\n CNPJ da Empresa: " + this.getEmp().getCnpj());
		sb.append("\n Razão Social: " + this.getEmp().getRazaoSocial());
		sb.append("\n------------------------------------------------------------" );
		sb.append("\n#########***Endereço da Empresa***#################" );
		sb.append("\n Rua: " + this.getEmp().getEnd().getRua() + ", n° " + this.getEmp().getEnd().getNumero());
		sb.append("\n Complemento: " + this.getEmp().getEnd().getComplemento() + ", cep : " + this.getEmp().getEnd().getCep());
		sb.append("\n Bairro: " + this.getEmp().getEnd().getBairro());
		sb.append("\n Cidade: " + this.getEmp().getEnd().getCidade() + " - " + this.getEmp().getEnd().getEstado());
		sb.append("\n-----------------------!!!FIM!!!------------------------------" );
		return sb.toString();
	}
	
}
