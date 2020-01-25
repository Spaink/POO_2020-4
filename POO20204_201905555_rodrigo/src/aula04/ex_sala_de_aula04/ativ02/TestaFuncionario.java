package aula04.ex_sala_de_aula04.ativ02;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Carlos", "191", 1000.0d);
		Funcionario g = new Gerente("Rodrigo","8933", 5000.0d);
		
		System.out.println("Salário do Funcionário: " + f.calculaBonificacao());
		System.out.println("Salário do Gerente: " + g.calculaBonificacao());

	}
}
