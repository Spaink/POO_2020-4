package aula09.ex_sala_de_aula09.ex01;

public class CadastroConta {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		cc1.depositar(3000.00);
		cp1.depositar(1000.00);
		
		cp1.transferir(5000.00, cc1);
		
	}

}
