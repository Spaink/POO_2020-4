package aula10.as08b.exercicio02;

import java.text.DecimalFormat;

public class Funcionario {
	
	private String nome;
	private int codigo;
	private double comissao;
	public static final double salarioBasico = 1000.00;
	
	public Funcionario(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	//Referente ao exercicio 08
	public Funcionario(String nome, int codigo, double comissao) {
		this.nome = nome;
		this.codigo = codigo;
		this.comissao = comissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	//Referente ao exercicio 11
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("\n Nome: " + this.getNome());
		bf.append("\n Comissão: " + df.format(this.getComissao()) + " reais");
		return bf.toString();
	}
	
}
