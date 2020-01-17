package Sala_de_aula01;

import java.text.DecimalFormat;

import Sala_de_aula01.Aluno;

class Aluno{
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double media;
}
public class CalculaMedia02 {
	public static void main(String[] args) {
		
		Aluno estudante1;
		estudante1 = new Aluno();
		
		Aluno estudante2;
		estudante2 = new Aluno();
		
		Aluno estudante3;
		estudante3 = new Aluno();
		
		Aluno estudante4;
		estudante4 = new Aluno();
		
		estudante1.nome = "Carlos";
		estudante2.nome = "André";
		estudante3.nome = "Marcio";
		estudante4.nome = "Leandro";
		
		estudante1.nota1 = 6.0;
		estudante1.nota2 = 7.8;
		estudante1.nota3 = 5.5;
		
		estudante2.nota1 = 7.0;
		estudante2.nota2 = 3.8;
		estudante2.nota3 = 2.5;
		
		estudante3.nota1 = 6.6;
		estudante3.nota2 = 5.8;
		estudante3.nota3 = 9.5;
		
		estudante4.nota1 = 3.0;
		estudante4.nota2 = 3.8;
		estudante4.nota3 = 9.5;
		
		estudante1.media = (estudante1.nota1 + estudante1.nota2 + estudante1.nota3)/3;
		estudante2.media = (estudante2.nota1 + estudante2.nota2 + estudante2.nota3)/3;
		estudante3.media = (estudante3.nota1 + estudante3.nota2 + estudante3.nota3)/3;
		estudante4.media = (estudante4.nota1 + estudante4.nota2 + estudante4.nota3)/3;
		
		double mediaGeral = (estudante1.media + estudante2.media + estudante3.media + estudante4.media)/4;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Média de " + estudante1.nome + " = " + df.format(estudante1.media));
		System.out.println("Média de " + estudante2.nome + " = " + df.format(estudante2.media));
		System.out.println("Média de " + estudante3.nome + " = " + df.format(estudante3.media));
		System.out.println("Média de " + estudante4.nome + " = " + df.format(estudante4.media));
		
		System.out.println("Média Geral = " + df.format(mediaGeral));
		
	}
}
