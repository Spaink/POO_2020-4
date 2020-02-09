package aula14.as12.exercicio04;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import aula10.as08b.exercicio04.Animal;
import aula10.as08b.exercicio04.Crocodilo;
import aula10.as08b.exercicio04.Elefante;
import aula10.as08b.exercicio04.Girafa;
import aula10.as08b.exercicio04.Hiena;
import aula10.as08b.exercicio04.Leao;
import aula10.as08b.exercicio04.Lobo;
import aula10.as08b.exercicio04.Macaco;
import aula10.as08b.exercicio04.Preguica;
import aula10.as08b.exercicio04.Tigre;
import aula10.as08b.exercicio04.Urso;

public class Test {
	
	private Animal crocodilo;
	private Animal elefante;
	private Animal girafa;
	private Animal hiena;
	private Animal leao;
	private Animal lobo;
	private Animal macaco;
	private Animal preguica;
	private Animal tigre;
	private Animal urso;
	
	@Before
	public void setup() {
		crocodilo = new Crocodilo("fred",12);
		elefante = new Elefante("jeff",5);
		girafa = new Girafa("karol",3);
		hiena = new Hiena("bellamy",7);
		leao = new Leao("berd",9);
		lobo = new Lobo("zes",11);
		macaco = new Macaco("many",1);
		preguica = new Preguica("proteus",2);
		tigre = new Tigre("mafu",10);
		urso = new Urso("glauss",8);
	}
	
	@org.junit.Test
	public void testSomCrocodilo() {
		assertEquals("auauaua",crocodilo.som());
	}
	
	@org.junit.Test
	public void testSomCrocodilo1() {
		assertEquals("Crocodilo emitindo som",crocodilo.som());
	}
	
	@org.junit.Test
	public void testSomElefante() {
		assertEquals("ncnjndc",elefante.som());
	}
	
	@org.junit.Test
	public void testSomElefante1() {
		assertEquals("Elefante emitindo som",elefante.som());
	}
	
	@org.junit.Test
	public void testSomGirafa() {
		assertEquals("sjdjcn",girafa.som());
	}
	
	@org.junit.Test
	public void testSomGirafa1() {
		assertEquals("Girafa emitindo som",girafa.som());
	}
	
	@org.junit.Test
	public void testSomHiena() {
		assertEquals("kkkkkkk",hiena.som());
	}
	
	@org.junit.Test
	public void testSomHiena1() {
		assertEquals("Hiena emitindo som",hiena.som());
	}
	
	@org.junit.Test
	public void testSomLeao() {
		assertEquals("rugido de leão",leao.som());
	}
	
	@org.junit.Test
	public void testSomLeao1() {
		assertEquals("Leão emitindo som",leao.som());
	}
	
	@org.junit.Test
	public void testSomLobo() {
		assertEquals("auuuuuu",lobo.som());
	}
	
	@org.junit.Test
	public void testSomLobo1() {
		assertEquals("Lobo emitindo som",lobo.som());
	}
	
	@org.junit.Test
	public void testSomMacaco() {
		assertEquals("hahahahah",macaco.som());
	}
	
	@org.junit.Test
	public void testSomMacaco1() {
		assertEquals("Macaco emitindo som",macaco.som());
	}
	
	@org.junit.Test
	public void testSomPreguica() {
		assertEquals("jcimd",preguica.som());
	}
	
	@org.junit.Test
	public void testSomPreguica1() {
		assertEquals("Preguiça emitindo som",preguica.som());
	}
	
	@org.junit.Test
	public void testSomTigre() {
		assertEquals("miau",tigre.som());
	}
	
	@org.junit.Test
	public void testSomTigre1() {
		assertEquals("Tigre emitindo som",tigre.som());
	}
	
	@org.junit.Test
	public void testSomUrso() {
		assertEquals("anfini",urso.som());
	}
	
	@org.junit.Test
	public void testSomUrso1() {
		assertEquals("Urso emitindo som",urso.som());
	}
}
