package aula09.as07b.exercicio04.item01;

public class Teste {

	public static void main(String[] args) {
		
		Editora ed1 = new Editora("Novo Plano", 73892, "5544-2221");
		
		Livros l1 = new Livros(88332,"Os Terraplanistas",ed1);
		Livros l2 = new Livros(8923,"Sem tetos",ed1);
		
		System.out.println("Dados dos Livros:");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());

	}

}
