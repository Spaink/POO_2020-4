package aula09.as07b.exercicio04.item03;

public class Teste {

	public static void main(String[] args) {
		
		Edicoes e1 = new Edicoes(43,"24/09/2019");
		Edicoes e2 = new Edicoes(47,"29/02/2020");
		
		Revistas r1 = new Revistas(833,"Java",e1);
		Revistas r2 = new Revistas(782,"Animais",e2);
		
		System.out.println("Dados das Revistas:");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		

	}

}
