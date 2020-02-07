package aula14.sala_aula_teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SaudeTeste {
	private Saude saude;
	
	@Before
	public void setup() {
		saude = new Saude();
	}
	
	@Test
	public void testaCondicaoFisica() {
		saude.setIdade(52);
		saude.setAltura(1.60);
		saude.setPeso(80.0);
		assertTrue(saude.condicaoFisica().contentEquals("Obesidade"));
	}
	
	@Test
	public void testaCondicaoFisica1() {
		saude.setIdade(88);
		saude.setAltura(1.70);
		saude.setPeso(70.0);
		assertTrue(saude.condicaoFisica().contentEquals("Sobrepeso"));
	}
	
	@Test
	public void testaCondicaoFisica2() {
		saude.setIdade(33);
		saude.setAltura(1.50);
		saude.setPeso(90.0);
		assertTrue(saude.condicaoFisica().contentEquals("Peso Normal"));
	}
	
	@Test
	public void testaCondicaoFisica3() {
		saude.setIdade(53);
		saude.setAltura(1.75);
		saude.setPeso(85.0);
		assertTrue(saude.condicaoFisica().contentEquals("Abaixo do Peso"));
	}
	
	@Test
	public void testaIMC() {
		saude.setIdade(20);
		saude.setAltura(1.64);
		saude.setPeso(62.0);
		double imc = saude.getPeso()/(saude.getAltura()*saude.getAltura());
		assertEquals(saude.calculaIMC(),23,0.5);
	}
	
	
}
