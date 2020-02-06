package aula13.ex_sala_de_aula13.excecao;

public class TestaCalculadora {

	public static void main(String[] args) {
		Calculadora app = new Calculadora();
		int a = 10;
		int b = 3;
		try {
			int c = app.multiplica(a,b);
			System.out.println("Resultado da multiplicacao de " + a + " por " + b + " = " + c);
		}catch(MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
		
		int [] numeros = {1,2,3,4,5};
		System.out.println("Soma do vetor: " + app.somar(numeros));
	}

}
