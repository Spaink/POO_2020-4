package aula09.as07b.exercicio01.interfaces;

public class Principal {

	public static void main(String[] args) {
		Empregado emp = new Empregado("8jdks","Rodrigo",20);
		Veiculo v = new Veiculo(39929,emp);
		
		Modelo md;
		
		md = new Empregado("8jdks","Rodrigo",20);
		md.imprimir();		
		
		md = new Veiculo(8929,emp);
		md.imprimir();

	}
}
