package aula04.ex_sala_de_aula04.ativ02;

public class Gerente extends Funcionario {
	
	public Gerente(String n, String c, double s) {
		super(n,c,s);
	}
	
	@Override
	public double calculaBonificacao(){
		double salario = this.getSalario();
		return salario *=1.15;
	}
}
