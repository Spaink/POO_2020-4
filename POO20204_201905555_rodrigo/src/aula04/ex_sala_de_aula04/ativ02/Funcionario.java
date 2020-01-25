package aula04.ex_sala_de_aula04.ativ02;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	public Funcionario() {
		
	}
	public Funcionario(String n, String c, double s) {
		this.nome = n;
		this.cpf = c;
		this.salario = s;
	}
	
	public double calculaBonificacao(){
		return this.salario *=1.1;
	}
}
