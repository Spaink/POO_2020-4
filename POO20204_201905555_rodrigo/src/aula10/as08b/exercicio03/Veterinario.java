package aula10.as08b.exercicio03;

public class Veterinario {
	
	public void examinar(Animal a) {
		a.emitirSom();
	}
	
	public String examina(Animal a) {
		return a.som();
	}
}
