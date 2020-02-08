package aula13.exerciciossala.salaaula.excecao;

public class TestaCalculadora {

	public static void main(String[] args) {
		Calculadora app = new Calculadora();
		int a = 10;
		int b = 0;
		try {
			int c = app.multiplica(a, b);
			System.out.println("Resultado da multiplicação de " + a +
					" por " + b + " = " + c );
		}catch(MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
		
		//int[] numeros = {1,2,3,4,5};
		
		//System.out.println("Soma do vetor: " + app.somar(numeros));
		
	}

}
