package aula11.ex_sala_aula11.singleton;

public class Conta {
	
	Banco banco;
	int codigo;
	String nome;

	Conta(int codigo, String nome) {
		banco = Banco.getInstancia();
		this.codigo = codigo;
		this.nome = nome;
	}
}
