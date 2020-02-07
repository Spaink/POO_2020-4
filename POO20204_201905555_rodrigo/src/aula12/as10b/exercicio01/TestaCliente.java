package aula12.as10b.exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Adaptador ad = new Adaptador();
		Cliente c = new Cliente(ad);
		
		c.executar();

	}

}
