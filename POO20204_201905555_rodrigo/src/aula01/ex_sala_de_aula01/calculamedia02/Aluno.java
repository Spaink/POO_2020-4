package aula01.ex_sala_de_aula01.calculamedia02;

class Aluno{
	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	double media(double nota1, double nota2, double nota3) {
		double m = (nota1+nota2+nota3)/3;
		return m;
	}
}
