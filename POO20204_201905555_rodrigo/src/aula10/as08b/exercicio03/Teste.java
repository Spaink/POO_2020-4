package aula10.as08b.exercicio03;

public class Teste {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Bidu",3);
		Animal cavalo = new Cavalo("Bangaré",8);
		Animal preguica = new Preguica("Cidy",4);
		
		Veterinario v = new Veterinario();
		
		v.examinar(cachorro);
		System.out.println("\n");
		v.examinar(cavalo);
		System.out.println("\n");
		v.examinar(preguica);
		System.out.println("\n");
		
		
	}

}
