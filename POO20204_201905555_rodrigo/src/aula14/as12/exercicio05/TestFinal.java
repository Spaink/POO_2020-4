package aula14.as12.exercicio05;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import aula10.as08b.exercicio05.Funcionario;
import aula10.as08b.exercicio05.FuncionarioEnsinoBasico;
import aula10.as08b.exercicio05.FuncionarioEnsinoMedio;
import aula10.as08b.exercicio05.FuncionarioEnsinoSuperior;

public class TestFinal {
	
	private Funcionario f1;
	private Funcionario f2;
	private Funcionario f3;
	private Funcionario f4;
	private Funcionario f5;
	private Funcionario f6;
	
	@Before
	public void setup() {
		
		f1 = new FuncionarioEnsinoBasico("Andrei",9302,"Sem nome");
		f2 = new FuncionarioEnsinoMedio("Marcelo",8932,"Jeruseva");
		f3 = new FuncionarioEnsinoSuperior("Rodrigo",8028,"UFG");
		f4 = new FuncionarioEnsinoBasico("Arlei",8832,250.00,"Fim de Mundo!!!");
		f5 = new FuncionarioEnsinoMedio("Madalena",7382,250.00,"Jerksk");
		f6 = new FuncionarioEnsinoSuperior("Roger",8293,600.00,"Unicamp");
		
	}
	
	@Test
	public void testComissaoF4() {
		double comissao = f4.getComissao();
		assertEquals(comissao,250,00);
	}
	
	@Test
	public void testComissao1F4() {
		double comissao = f4.getComissao();
		assertEquals(comissao,255,00);
	}
	
	@Test
	public void testComissaoF5() {
		double comissao = f5.getComissao();
		assertEquals(comissao,250,00);
	}
	
	@Test
	public void testComissao1F5() {
		double comissao = f5.getComissao();
		assertEquals(comissao,290,00);
	}
	
	@Test
	public void testComissaoF6() {
		double comissao = f6.getComissao();
		assertEquals(comissao,750,00);
	}
	
	@Test
	public void testComissao1F6() {
		double comissao = f6.getComissao();
		assertEquals(comissao,600,00);
	}

	@Test
	public void testNomeF1() {
		assertEquals("Andrei",f1.getNome());
	}
	
	@Test
	public void testNome1F1() {
		assertEquals("Andy",f1.getNome());
	}
	
	@Test
	public void testCodigoF1() {
		assertEquals(930289,f1.getCodigo());
	}
	
	@Test
	public void testCodigo1F1() {
		assertEquals(9302,f1.getCodigo());
	}
	
	@Test
	public void testEscolaF1() {
		assertEquals("Sem nome",((FuncionarioEnsinoBasico) f1).getEscola());
	}
	
	@Test
	public void testEscola1F1() {
		assertEquals("jhsjjdk",((FuncionarioEnsinoBasico) f1).getEscola());
	}
	
	@Test
	public void testNomeF2() {
		assertEquals("Adds",f2.getNome());
	}
	
	@Test
	public void testNome1F2() {
		assertEquals("Marcelo",f2.getNome());
	}
	
	@Test
	public void testCodigoF2() {
		assertEquals(8932,f2.getCodigo());
	}
	
	@Test
	public void testCodigo1F2() {
		assertEquals(97382,f2.getCodigo());
	}
	
	@Test
	public void testEscolaF2() {
		assertEquals("ncjdjc",((FuncionarioEnsinoMedio) f2).getEscola());
	}
	
	@Test
	public void testEscola1F2() {
		assertEquals("Jeruseva",((FuncionarioEnsinoMedio) f2).getEscola());
	}
	
	@Test
	public void testNomeF3() {
		assertEquals("hjkk",f3.getNome());
	}
	
	@Test
	public void testNome1F3() {
		assertEquals("Rodrigo",f3.getNome());
	}
	
	@Test
	public void testCodigoF3() {
		assertEquals(73828,f3.getCodigo());
	}
	
	@Test
	public void testCodigo1F3() {
		assertEquals(8028,f3.getCodigo());
	}
	
	@Test
	public void testEscolaF3() {
		assertEquals("ncjdksmc",((FuncionarioEnsinoSuperior) f3).getUniversidade());
	}
	
	@Test
	public void testEscola1F3() {
		assertEquals("UFG",((FuncionarioEnsinoSuperior) f3).getUniversidade());
	}
	
	@Test
	public void testSalarioF1() {
		double salario = ((FuncionarioEnsinoBasico) f1).getSalario();
		assertEquals(salario,1234,23);
	}
	
	@Test
	public void testSalario1F1() {
		double salario = ((FuncionarioEnsinoBasico) f1).getSalario();
		assertEquals(salario,1100,00);
	}
	
	@Test
	public void testSalarioF2() {
		double salario = ((FuncionarioEnsinoMedio) f2).getSalario();
		assertEquals(salario,1777,23);
	}
	
	@Test
	public void testSalario1F2() {
		double salario = ((FuncionarioEnsinoMedio) f2).getSalario();
		assertEquals(salario,1650,00);
	}
	
	@Test
	public void testSalarioF3() {
		double salario = ((FuncionarioEnsinoSuperior) f3).getSalario();
		assertEquals(salario,3543,23);
	}
	
	@Test
	public void testSalario1F3() {
		double salario = ((FuncionarioEnsinoSuperior) f3).getSalario();
		assertEquals(salario,3300,00);
	}
	
	@Test
	public void testSalarioF4() {
		double salario = ((FuncionarioEnsinoBasico) f4).getSalario();
		assertEquals(salario,1432,23);
	}
	
	@Test
	public void testSalario1F4() {
		double salario = ((FuncionarioEnsinoBasico) f4).getSalario();
		assertEquals(salario,1350,00);
	}
	
	@Test
	public void testSalarioF5() {
		double salario = ((FuncionarioEnsinoMedio) f5).getSalario();
		assertEquals(salario,1993,23);
	}
	
	@Test
	public void testSalario1F5(){
		double salario = ((FuncionarioEnsinoMedio) f5).getSalario();
		assertEquals(salario,1900,00);
	}
	
	@Test
	public void testSalarioF6() {
		double salario = ((FuncionarioEnsinoSuperior) f6).getSalario();
		assertEquals(salario,1554,23);
	}
	
	@Test
	public void testSalario1F6() {
		double salario = ((FuncionarioEnsinoSuperior) f6).getSalario();
		assertEquals(salario,3900,00);
	}
	
	@Test
	public void testTotSalarioEnsinoBasico() {
		double s1 = ((FuncionarioEnsinoBasico) f1).getSalario();
		double s2 = ((FuncionarioEnsinoBasico) f4).getSalario();
		double tot = s1 + s2;
		assertEquals(tot,2450,00);
	}
	
	@Test
	public void testTotSalarioEnsinoBasico1() {
		double s1 = ((FuncionarioEnsinoBasico) f1).getSalario();
		double s2 = ((FuncionarioEnsinoBasico) f4).getSalario();
		double tot = s1 + s2;
		assertEquals(tot,2250,00);
	}
	
	@Test
	public void testTotSalarioEnsinoMedio() {
		double s1 = ((FuncionarioEnsinoMedio) f2).getSalario();
		double s2 = ((FuncionarioEnsinoMedio) f5).getSalario();
		double tot = s1 + s2;
		assertEquals(tot,3550,00);
	}
	
	@Test
	public void testTotSalarioEnsinoMedio1() {
		double s1 = ((FuncionarioEnsinoMedio) f2).getSalario();
		double s2 = ((FuncionarioEnsinoMedio) f5).getSalario();
		double tot = s1 + s2;
		assertEquals(tot,7389,00);
	}
	
	@Test
	public void testTotSalarioEnsinoSuperior() {
		double s1 = ((FuncionarioEnsinoSuperior) f3).getSalario();
		double s2 = ((FuncionarioEnsinoSuperior) f6).getSalario();
		double tot = s1 + s2;
		assertEquals(tot,7830,00);
	}
	
	@Test
	public void testTotSalarioEnsinoSuperior1() {
		double s1 = ((FuncionarioEnsinoSuperior) f3).getSalario();
		double s2 = ((FuncionarioEnsinoSuperior) f6).getSalario();
		double tot = s1 + s2;
		assertEquals(tot,5200,00);
	}
}
