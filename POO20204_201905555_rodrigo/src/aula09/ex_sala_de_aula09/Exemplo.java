package aula09.ex_sala_de_aula09;

public class Exemplo implements IExemplo, IExemplo2{

	@Override
	public void metodo1() {
		System.out.println("Implementando o m�todo 1");

	}

	@Override
	public String metodo2() {
		return "Implementando o m�todo 2";
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
		System.out.println("Implementando o m�todo 3");
		
	}
	
	
}
