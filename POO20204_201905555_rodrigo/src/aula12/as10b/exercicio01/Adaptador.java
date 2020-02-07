package aula12.as10b.exercicio01;

public class Adaptador implements SomadorEsperado {
	
	int soma = 0;
	@Override
	public int somaVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

}
