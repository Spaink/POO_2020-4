package aula09.as07b.exercicio01.interfaces;

public interface Modelo {
	
	public void imprimir();
	public String toString();
	
	public default String titulo() {
		String tituloDoProjeto = "Projeto de Ensino";
		return tituloDoProjeto;
	}
	
}
