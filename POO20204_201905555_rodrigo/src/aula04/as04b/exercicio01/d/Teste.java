package aula04.as04b.exercicio01.d;

public class Teste {

	public static void main(String[] args) {
		
		Endereco p = new Endereco("R-22",7,"casa",70647000,"Vila Itatiaia","Goi�nia","Goi�s");
		Empresa r = new Empresa("738.39903.23333","Sei l� kkkkk",p);
		Empregado k = new Empregado("Rodrigo Alves",839393003,r);
		
		System.out.println(k.toString());
	}

}
