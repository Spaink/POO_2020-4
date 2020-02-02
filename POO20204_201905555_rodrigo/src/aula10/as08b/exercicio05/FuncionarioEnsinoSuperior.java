package aula10.as08b.exercicio05;

import java.text.DecimalFormat;

public class FuncionarioEnsinoSuperior extends Funcionario {
	
	private double salarioFes = ((salarioBasico*1.10)*1.50)*2.00;
	private String universidade;
	private double salario = salarioFes;
	
	public double getSalario() {
		return salario + getComissao();
	}
	
	public FuncionarioEnsinoSuperior(String nome, int codigo, String u) {
		super(nome, codigo);
		this.universidade = u;
		// TODO Auto-generated constructor stub
	}
	
	//Referente ao exercicio 08
	
	public FuncionarioEnsinoSuperior(String nome, int codigo, double comissao, String universidade) {
		super(nome, codigo, comissao);
		this.universidade = universidade;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	//Referente ao exercicio 11
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append(super.toString());
		bf.append("\n Salário Total: " + df.format(this.getSalario()) + " reais");
		return bf.toString();
	}

}
