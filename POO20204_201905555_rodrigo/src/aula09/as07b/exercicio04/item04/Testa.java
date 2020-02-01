package aula09.as07b.exercicio04.item04;

public class Testa {

	public static void main(String[] args) {
		
		Perecivel p = new Perecivel("Manga",6.89,8273,90);
		NaoPerecivel  np= new NaoPerecivel("Sardinha",5.89,9823,5);
		
		System.out.println("Dados dos Produtos");
		System.out.println(p.toString());
		System.out.println(np.toString());

	}

}
