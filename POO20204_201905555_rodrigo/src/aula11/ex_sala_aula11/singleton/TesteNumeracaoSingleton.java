package aula11.ex_sala_aula11.singleton;

public class TesteNumeracaoSingleton {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			NumeracaoSingleton num 	= NumeracaoSingleton.getInstancia();
			System.out.println(num);
		}

	}

}
