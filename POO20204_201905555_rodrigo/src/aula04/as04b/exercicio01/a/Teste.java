package aula04.as04b.exercicio01.a;

public class Teste {
	public static void main(String[] args) {
		
		Compositores c1 = new Compositores ("Z� ninguem","Brasil");
		Compositores c2 = new Compositores ("Gilmar ","Brasil");
		Compositores c3 = new Compositores ("KLX","Brasil");
		
		Musicas m1 = new Musicas("Estou nem ae", 1994, "brega", c1);
		Musicas m2 = new Musicas("S� POO", 2020, "Java", c2);
		Musicas m3 = new Musicas("Bl�bl�bl�", 2009, "Sei l� mano", c3);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());	
	}
}
