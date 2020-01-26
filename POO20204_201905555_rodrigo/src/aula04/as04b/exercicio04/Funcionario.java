package aula04.as04b.exercicio04;

import java.text.DecimalFormat;

public class Funcionario {
	
	private String nome;
	private String telefone;
	private int matricula;
	private double salario;
	private String horario;
	
	public Funcionario(String nome, String telefone, int matricula, double salario) {
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public Funcionario(String nome, String telefone, int matricula, double salario, String horario) {
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.salario = salario;
		this.horario = horario;
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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void aumentoSalario(int k) {
		double novoSalario;
		double ind = ((double)k/100) + 1.00;
		novoSalario = ind * getSalario();
		this.setSalario(novoSalario);
	}
	
	public double salarioAnual() {
		double salarioAnual = getSalario()*12;
		return salarioAnual;
	}
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	public String toString1() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome do Funcionário: " + this.getNome());
		sb.append("\nTelefone: " + this.getTelefone());
		sb.append("\nMatrícula: " + this.getMatricula());
		sb.append("\nSalário: " + df.format(this.getSalario()) + " reais");
		sb.append("\nHorário: " + this.getHorario());
		return sb.toString();
	}
	
	public String toString2() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome do Funcionário: " + this.getNome());
		sb.append("\nTelefone: " + this.getTelefone());
		sb.append("\nMatrícula: " + this.getMatricula());
		sb.append("\nSalário: " + df.format(this.getSalario()) + " reais");
		return sb.toString();
	}
}
