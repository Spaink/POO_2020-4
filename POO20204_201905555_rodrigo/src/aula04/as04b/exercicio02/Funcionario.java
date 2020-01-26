package aula04.as04b.exercicio02;

import java.text.DecimalFormat;

public class Funcionario {
	
	private String cpf;
	private int matricula;
	private String nome;
	private String cargo;
	private double salario;
	private String departamento;
	private Endereco end;
	
	public Funcionario(String nome, String cpf, int matricula) {
		this.cpf = cpf;
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}


	public void aumentaSalario(int k) {
		double novoSalario;
		double ind = ((double)k/100) + 1.00;
		novoSalario = ind *this.getSalario();
		this.salario = novoSalario;
	}
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n" + this.getMatricula() + " - " + this.getCpf() + " - " + this.getNome() + " - Departamento: " + this.getDepartamento() + " - Cargo: " + this.getCargo() + " - Salário: " + df.format(this.getSalario()) );
		return sb.toString();
	}
}
