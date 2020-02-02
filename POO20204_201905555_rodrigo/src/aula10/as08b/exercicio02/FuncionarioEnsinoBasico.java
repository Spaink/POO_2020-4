package aula10.as08b.exercicio02;

import java.text.DecimalFormat;

public class FuncionarioEnsinoBasico extends Funcionario {
	
	private  double salarioFeb = (salarioBasico*1.10);
	private String escola;
	private double salario = salarioFeb;

	
	public double getSalario() {
		return salario + getComissao();
	}

	public FuncionarioEnsinoBasico(String nome, int codigo, String e) {
		super(nome, codigo);
		this.escola = e;
		// TODO Auto-generated constructor stub
	}
	
	//Referente ao exercicio 08
	
	public FuncionarioEnsinoBasico(String nome, int codigo, double comissao, String escola) {
		super(nome, codigo, comissao);
		this.escola = escola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	//Referente ao exercicio 11
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append(super.toString());
		bf.append("\n Sal�rio Total: " + df.format(this.getSalario()) + " reais");
		return bf.toString();
	}

}
