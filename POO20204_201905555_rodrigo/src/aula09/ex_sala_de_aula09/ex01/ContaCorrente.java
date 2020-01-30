package aula09.ex_sala_de_aula09.ex01;

public class ContaCorrente extends Conta  implements Tributavel{
	
	private double juros;
	
	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return saldo * taxa;
	}

	public boolean validaConta() {
		if(numero >= 100000) {
			return false;
		}else {
			return true;
		}
	}
	
}
