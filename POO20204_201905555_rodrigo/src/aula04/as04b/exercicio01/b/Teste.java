package aula04.as04b.exercicio01.b;

public class Teste {
	public static void main(String[] args) {
		
		Departamento dp = new Departamento("Instituto de Inform�tica", "INF");
		
		Cursos c1 = new Cursos("Engenharia de Software","ES",dp);
		
		Cursos c2 = new Cursos("Ci�ncia da Computa��o","CC",dp);
		Cursos c3 = new Cursos("Sistemas da Informa��o","SI",dp);
		Cursos c4 = new Cursos("Intelig�ncia Artificial","IA",dp);
		
		Alunos a1 = new Alunos("Rodrigo Alves",201905555,2019,c1);
		Alunos a2 = new Alunos("Manuel",201908938,2017,c2);
		Alunos a3 = new Alunos("Carlos",201903277,2015,c3);
		Alunos a4 = new Alunos("Andr�",202004452,2020,c4);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
