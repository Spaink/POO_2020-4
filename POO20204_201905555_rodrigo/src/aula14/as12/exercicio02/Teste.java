package aula14.as12.exercicio02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as08b.exercicio02.Animal;
import aula10.as08b.exercicio02.Cachorro;
import aula10.as08b.exercicio02.Cavalo;
import aula10.as08b.exercicio02.Preguica;

public class Teste {
	private Animal cachorro;
	private Animal cavalo;
	private Animal preguica;
	
	@Before
	public void setup() {
		cachorro = new Cachorro("Bidu",3);
		cavalo = new Cavalo("Bangaré",8);
		preguica = new Preguica("Cidy",4);
	}
	
	@Test
	public void testaNomeCachorro() {
		assertTrue(cachorro.getNome().contentEquals("Bidu"));
	}
	
	@Test
	public void testaNomeCachorro1() {
		assertTrue(cachorro.getNome().contentEquals("Biu"));
	}
	
	@Test
	public void testaIdadeCachorro() {
		assertEquals(4,cachorro.getIdade());
	}
	
	@Test
	public void testaIdadeCachorro1() {
		assertEquals(3,cachorro.getIdade());
	}
	
	@Test
	public void testaNomeCavalo() {
		assertTrue(cavalo.getNome().contentEquals("Bang"));
	}
	
	@Test
	public void testaNomeCavalo1() {
		assertTrue(cavalo.getNome().contentEquals("Bangaré"));
	}
	
	@Test
	public void testaIdadeCavalo() {
		assertEquals(2,cavalo.getIdade());
	}
	
	@Test
	public void testaIdadeCavalo1() {
		assertEquals(8,cavalo.getIdade());
	}
	
	@Test
	public void testaNomePreguica() {
		assertTrue(preguica.getNome().contentEquals("Cidy"));
	}
	
	@Test
	public void testaNomePreguica1() {
		assertTrue(preguica.getNome().contentEquals("cid"));
	}
	
	@Test
	public void testaIdadePreguica() {
		assertEquals(4,preguica.getIdade());
	}
	
	@Test
	public void testaIdadePreguica1() {
		assertEquals(6,preguica.getIdade());
	}
}
