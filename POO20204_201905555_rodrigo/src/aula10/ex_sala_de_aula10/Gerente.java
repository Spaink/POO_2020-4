package aula10.ex_sala_de_aula10;

public class Gerente  extends Funcionario{
	
	private int senha;
	
	public double bonificacao(){
		double b = salario * 0.15;
		return b;
	}
}
