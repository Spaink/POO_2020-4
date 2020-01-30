package aula09.ex_sala_de_aula09.ex01;

public class ContaPoupanca extends Conta {
	private double juros;

	public boolean validaConta() {
		if(numero > 100000) {
			return false;
		}else {
			return true;
		}
	}
}
