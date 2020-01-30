package aula09.ex_sala_de_aula09;

public class Exemplo implements IExemplo, IExemplo2{

	@Override
	public void metodo1() {
		System.out.println("Implementando o método 1");

	}

	@Override
	public String metodo2() {
		return "Implementando o método 2";
	}
	
	public static void main(String [] args) {
		IExemplo ie = new Exemplo();
		ie.metodo1();
		System.out.println(ie.metodo2());
		IExemplo2 ie2 = new Exemplo();
		ie2.metodo3();
	}

	@Override
	public void metodo3() {
		System.out.println("Implementando o método 3");
		
	}
	
	
}
