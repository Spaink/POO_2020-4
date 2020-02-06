package aula11.as09b.exercicio03;

public class Incremental {
	
	public static Incremental instance;
	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}
	
	public static Incremental getInstance() {
		if(instance == null) {
			instance = new Incremental();
		}
		return instance;	
	}
	public String toString() {
		return "Incremental " + numero;
	}
}
