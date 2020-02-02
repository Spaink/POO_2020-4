package aula10.as08b.exercicio02;

import java.text.DecimalFormat;

public class FuncionarioSemEscolaridade extends Funcionario {
	
	private double salario = salarioBasico;	
	
	public double getSalario() {
		return salario + getComissao();
	}

	public FuncionarioSemEscolaridade(String nome, int codigo) {
		super(nome, codigo);
		// TODO Auto-generated constructor stub
	}
	
	//Referente ao exercicio 08
	
	public FuncionarioSemEscolaridade(String nome, int codigo, double comissao) {
		super(nome, codigo, comissao);
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
