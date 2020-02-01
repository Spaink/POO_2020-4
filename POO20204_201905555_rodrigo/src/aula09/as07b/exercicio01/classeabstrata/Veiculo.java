package aula09.as07b.exercicio01.classeabstrata;

public class Veiculo extends Modelo{
	
	private int placa;
	private Empregado responsavel;
	
	public Veiculo(String tituloDoProjeto,int placa, Empregado responsavel) {
		super(tituloDoProjeto);
		this.placa = placa;
		this.responsavel = responsavel;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public Empregado getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}
	
	public void imprimir() {
		System.out.println("Titulo do Projeto: " + this.getTituloDoProjeto());
		System.out.println("Responsável pelo Projeto: " + this.getResponsavel().getNome());
		System.out.println("Placa do Veículo: " + this.getPlaca() + "\n");
	}
	
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("\nTitulo do Projeto: " + this.getTituloDoProjeto());
		bf.append("\nResponsável pelo Projeto: " + this.getResponsavel().getNome());
		bf.append("\nPlaca do Veículo: " + this.getPlaca() + "\n");
		return bf.toString();
	}
	
}
