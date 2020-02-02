package aula10.as08b.exercicio02;

public class Teste {

	public static void main(String[] args) {
		
		
		Animal cachorro = new Cachorro("Bidu",3);
		Animal cavalo = new Cavalo("Bangaré",8);
		Animal preguica = new Preguica("Cidy",4);
		
		cachorro.emitirSom();
		System.out.println("\n");
		cavalo.emitirSom();
		System.out.println("\n");
		preguica.emitirSom();
		System.out.println("\n");
		
		
	}

}
