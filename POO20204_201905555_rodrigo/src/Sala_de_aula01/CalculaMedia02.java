package Sala_de_aula01;

import java.text.DecimalFormat;

import Sala_de_aula01.Aluno;

public class CalculaMedia02 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		Aluno a2 = new Aluno();
		
		Aluno a3 = new Aluno();
		
		Aluno a4 = new Aluno();
		
		a1.nome = "Carlos";
		a2.nome = "André";
		a3.nome = "Marcio";
		a4.nome = "Leandro";
		
		a1.nota1 = 6.0;
		a1.nota2 = 7.8;
		a1.nota3 = 5.5;
		
		a2.nota1 = 7.0;
		a2.nota2 = 3.8;
		a2.nota3 = 2.5;
		
		a3.nota1 = 6.6;
		a3.nota2 = 5.8;
		a3.nota3 = 9.5;
		
		a4.nota1 = 3.0;
		a4.nota2 = 3.8;
		a4.nota3 = 9.5;
		
		double m1 = a1.media(a1.nota1,a1.nota2,a1.nota3);
		double m2 = a2.media(a2.nota1,a2.nota2,a2.nota3);
		double m3 = a3.media(a3.nota1,a3.nota2,a3.nota3);
		double m4 = a4.media(a4.nota1,a4.nota2,a4.nota3);
		
		double mediaGeral = (m1 + m2 + m3 + m4)/4;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Média de " + a1.nome + " = " + df.format(m1));
		System.out.println("Média de " + a2.nome + " = " + df.format(m2));
		System.out.println("Média de " + a3.nome + " = " + df.format(m3));
		System.out.println("Média de " + a4.nome + " = " + df.format(m4));
		
		System.out.println("Média Geral = " + df.format(mediaGeral));
		
	}
}
