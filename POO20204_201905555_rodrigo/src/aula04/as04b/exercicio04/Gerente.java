package aula04.as04b.exercicio04;

import java.text.DecimalFormat;

public class Gerente extends Funcionario{
	
	private double bonificacao;
	private String tipo;
	
	public Gerente(String nome, String telefone, int matricula, double salario, double bonificacao,
			String tipo) {
		super(nome, telefone, matricula, salario);
		this.bonificacao = bonificacao;
		this.tipo = tipo;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double salarioAnual() {
		double salarioAnual = (getSalario()+getBonificacao())*12;
		return salarioAnual;
	}
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString2());
		sb.append("\nBonificação: " + df.format(this.getBonificacao()) + " reais");
		sb.append("\nTipo: " + this.getTipo());
		return sb.toString();
	}
	
}
