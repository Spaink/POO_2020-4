package aula04.as04b.exercicio03;

import java.text.DecimalFormat;

public class Cadastro {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		Funcionario c = new Funcionario("André","(62)98933-3456",89393,890.22,"12H - 18h");
		c.aumentoSalario(10);
		System.out.println(c.toString1());
		System.out.println("Recebimento Anual = " + df.format(c.salarioAnual()) + " reais");
		
		Gerente g = new Gerente("Rodrigo","(62) 98643-2709",89932,3892.44,789.33,"PJ");
		g.aumentoSalario(20);
		System.out.println(g.toString());
		System.out.println("Recebimento Anual = " +df.format(g.salarioAnual()) + " reais");
		
		Cliente c1 = new Cliente("Marcos","(44)96373-2288",31,"839390202","A");
		Cliente c2 = new Cliente("Carlos","(67)96213-3182",44,"5958302","A");
		Cliente c3 = new Cliente("Ana","(44)99485-8423",20,"6859402","A");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		c2.desativaCliente();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}

}
