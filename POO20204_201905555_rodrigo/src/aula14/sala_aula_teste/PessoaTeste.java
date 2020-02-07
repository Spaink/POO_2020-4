package aula14.sala_aula_teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula03.as03b.exercicio01.Pessoa2;
import util.ConverteData;

public class PessoaTeste {
	
	private Pessoa2 pessoa;
	
	@Before
	public void setup() {
		pessoa = new Pessoa2();
	}
	
	@Test
	public void testaIdade() {
		pessoa.setNome("Malaquias");
		pessoa.setAltura(1.75);
		try {
			pessoa.setDataNascimento(ConverteData.convertStringToDate("20/10/1920"));
		}catch(Exception e) {
			e.getMessage();
		}
		assertTrue(pessoa.calculaIdade() == 100);	
	}
	
}
