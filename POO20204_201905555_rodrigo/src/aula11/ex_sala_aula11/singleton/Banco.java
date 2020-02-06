package aula11.ex_sala_aula11.singleton;

public final class Banco {
	
	public static Banco instancia;
	int codigo;
	String nome;
	
	private Banco() {
		codigo = 001;
		nome = "Banco do Brasil";
	}
	
	public static Banco getInstancia(){
		if (instancia == null) {
			instancia = new Banco();
		}
		return instancia;
	}
}
