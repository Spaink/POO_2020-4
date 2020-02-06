package aula12.ex_sala_de_aula12.adapter;

public class Teste {

	public static void main(String[] args) {
		BalancaDieta balanca = new BalancaDieta();
		Dieta dieta = new Dieta();
		dieta.registerObserver(balanca);
		dieta.setPeso(150.00);

	}

}
