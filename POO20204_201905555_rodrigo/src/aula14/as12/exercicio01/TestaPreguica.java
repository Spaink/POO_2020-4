package aula14.as12.exercicio01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as08b.exercicio01.Preguica;

public class TestaPreguica {
	
	private Preguica preguica;
	
	@Before
	public void setup() {
		preguica = new Preguica("Cidy",3);
	}
	
	@Test
	public void testaSom1() {
		assertTrue(preguica.som().contentEquals("preguiça emitindo som"));
	}
	
	@Test
	public void testaSom2() {
		assertTrue(preguica.som().contentEquals("A preguiça está emitindo algum som"));
	}
	
	@Test
	public void testaSom3() {
		assertTrue(preguica.som().contentEquals("som de preguiça"));
	}
	
	@Test
	public void testaSom4() {
		assertTrue(preguica.som().contentEquals("preguices"));
	}
	
	@Test
	public void testaSom5() {
		assertTrue(preguica.som().contentEquals("prepssjjs"));
	}
}
