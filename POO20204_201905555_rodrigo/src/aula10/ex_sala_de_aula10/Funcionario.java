package aula10.ex_sala_de_aula10;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public double bonificacao(){
		double b = salario * 0.10;
		return b;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
