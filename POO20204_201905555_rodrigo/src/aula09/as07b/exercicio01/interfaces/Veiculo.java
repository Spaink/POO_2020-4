package aula09.as07b.exercicio01.interfaces;

public class Veiculo implements Modelo {

	private int placa;
	private Empregado responsavel;
	
	public Veiculo(int placa,Empregado responsavel) {
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
		System.out.println(toString());
	}
	
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("\nResponsável pelo Projeto: " + this.getResponsavel().getNome());
		bf.append("\nPlaca do Veículo: " + this.getPlaca() + "\n");
		return bf.toString();
	}
}
