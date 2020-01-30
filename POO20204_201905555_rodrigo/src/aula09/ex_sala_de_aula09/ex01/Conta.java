package aula09.ex_sala_de_aula09.ex01;

public abstract class Conta {
	protected int numero;
	protected Cliente titular;
	protected double saldo;

	public void sacar(double valor) {
		if(this.saldo < valor) {
			this.saldo = saldo - valor;
		}else {
			System.out.println("Saldo Suficiente");
		}
		
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public void transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	public abstract boolean validaConta();
}
