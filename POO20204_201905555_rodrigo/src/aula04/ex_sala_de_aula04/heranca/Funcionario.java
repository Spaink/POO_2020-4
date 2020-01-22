package aula04.ex_sala_de_aula04.heranca;

public class Funcionario extends PessoaFisica{
	
	private int matricula;
	private double salario;
	private String cargo;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil, int matricula, double salario, String cargo){
		super(nome, endereco, telefone, cpf, estadoCivil, sexo);
		this.matricula = matricula;
		this.salario = salario;
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nMatricula do Funcion�rio: " + this.getMatricula());
		sb.append("\nSalario do Funcion�rio: " + this.getSalario());
		sb.append("\nCargo do Funcion�rio : " + this.getCargo());
		return sb.toString();
	}	
}
