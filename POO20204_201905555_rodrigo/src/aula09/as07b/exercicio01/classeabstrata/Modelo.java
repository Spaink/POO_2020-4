package aula09.as07b.exercicio01.classeabstrata;

public abstract class Modelo {
	private String tituloDoProjeto;
	
	
	public Modelo(String tituloDoProjeto) {
		this.tituloDoProjeto = tituloDoProjeto;
	}

	public String getTituloDoProjeto() {
		return tituloDoProjeto;
	}

	public void setTituloDoProjeto(String tituloDoProjeto) {
		this.tituloDoProjeto = tituloDoProjeto;
	}
	
	public abstract void imprimir();
	public abstract String toString();
}
