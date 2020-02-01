package aula09.as07b.exercicio01.classeabstrata;

public class Principal {

	public static void main(String[] args) {
		
		Empregado em = new Empregado("Projeto Java","8jdks","Rodrigo",20);
		Veiculo v = new Veiculo("Projeto Java",38920,em);
		
		em.imprimir();
		v.imprimir();
		
		System.out.println(em.toString());
		System.out.println(v.toString());

	}

}
