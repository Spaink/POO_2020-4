package aula12.ex_sala_aula12.sigaa.salaaula.observer;

public class Teste {

	public static void main(String[] args) {
		BalancaDieta balanca = new BalancaDieta();
		Dieta dieta = new Dieta();
		dieta.registerObserver(balanca);
		dieta.setPeso(150.0);
	}
}
