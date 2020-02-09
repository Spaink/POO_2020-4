package aula14.as12.exercicio01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as08b.exercicio01.Cachorro;

public class TestaCachorro {
	
	private Cachorro cachorro;
	
	@Before
	public void setup() {
		cachorro = new Cachorro("Bidu",5);
	}
	
	@Test
	public void testaSom1() {
		assertTrue(cachorro.som().contentEquals("Cachorro Latindo"));
	}
	
	@Test
	public void testaSom2() {
		assertTrue(cachorro.som().contentEquals("O Cachorro está latindo!!!"));
	}
	
	@Test
	public void testaSom3() {
		assertTrue(cachorro.som().contentEquals("auauauauau!!!"));
	}
	
	@Test
	public void testaSom4() {
		assertTrue(cachorro.som().contentEquals("Latindo..."));
	}
	
	@Test
	public void testaSom5() {
		assertTrue(cachorro.som().contentEquals("O cachorro está latindo!!!"));
	}
	
	
}
