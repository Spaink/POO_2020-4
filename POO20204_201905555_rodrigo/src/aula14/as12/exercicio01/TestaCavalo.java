package aula14.as12.exercicio01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as08b.exercicio01.Cavalo;

public class TestaCavalo {
	
	private Cavalo cavalo;
	
	@Before
	public void setup() {
		cavalo = new Cavalo("Protheus",7);
	}
	
	@Test
	public void testaSom1() {
		assertTrue(cavalo.som().contentEquals("Cavalo emitindo som"));
	}
	
	@Test
	public void testaSom2() {
		assertTrue(cavalo.som().contentEquals("horheshes"));
	}
	
	@Test
	public void testaSom3() {
		assertTrue(cavalo.som().contentEquals("som de cavalo"));
	}
	
	@Test
	public void testaSom4() {
		assertTrue(cavalo.som().contentEquals("cavales"));
	}
	
	@Test
	public void testaSom5() {
		assertTrue(cavalo.som().contentEquals("O cavalo está emitindo algum som!!!"));
	}
}
