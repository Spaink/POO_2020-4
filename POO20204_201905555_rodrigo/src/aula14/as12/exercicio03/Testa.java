package aula14.as12.exercicio03;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import aula10.as08b.exercicio03.Cachorro;
import aula10.as08b.exercicio03.Cavalo;
import aula10.as08b.exercicio03.Preguica;
import aula10.as08b.exercicio03.Animal;
import aula10.as08b.exercicio03.Veterinario;

public class Testa {
	
	private Animal cachorro;
	private Animal cavalo;
	private Animal preguica;
	private Veterinario vet;
	
	@Before
	public void setup() {
		cachorro = new Cachorro("Bidu",3);
		cavalo = new Cavalo("Bangaré",8);
		preguica = new Preguica("Cidy",4);
		vet = new Veterinario();
	}
	
	@Test
	public void testSomVetCachorro() {
		assertEquals("auauaua",vet.examina(cachorro));
	}
	
	@Test
	public void testSomVetCachorro1() {
		assertEquals("O cachorro está latindo!!!",vet.examina(cachorro));
	}
	
	@Test
	public void testSomVetCavalo() {
		assertEquals("hrshrhhs",vet.examina(cavalo));
	}
	
	@Test
	public void testSomVetCavalo1() {
		assertEquals("O cavalo está emitindo algum som!!!",vet.examina(cavalo));
	}
	
	@Test
	public void testSomVetPreguica() {
		assertEquals("som preguiça",vet.examina(preguica));
	}
	
	@Test
	public void testSomVetPreguica1() {
		assertEquals("A preguiça está emitindo algum som",vet.examina(preguica));
	}
}
