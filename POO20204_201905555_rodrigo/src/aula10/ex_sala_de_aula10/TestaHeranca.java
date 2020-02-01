package aula10.ex_sala_de_aula10;

public class TestaHeranca {
	public static void main(String [] args){
		Gerente g = new Gerente();
		
		g.setSalario(3000);
		
		System.out.println("A bonificacao é: " + g.bonificacao());
		
		Funcionario f = new Funcionario();
		f.setSalario(3000);
		
		System.out.println("A bonificacão do Funcionário é : " + f.bonificacao());
		
		Funcionario ger = new Gerente();
		ger.setSalario(3000);
		
		System.out.println("O valor da bonificacão é : " + ger.bonificacao());
	}
}
