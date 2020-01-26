package aula04.as04b.exercicio01.c;

public class Teste {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("R-22",7,"casa",70647000,"Vila Itatiaia","Goiânia","Goiás");
		Cliente c = new Cliente("Rodrigo","093.478.333-90",end);
		
		System.out.println(c.toString());
	}

}
