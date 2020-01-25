package aula03.as03b.exercicio03;

public class Elevador {
	
	private int andarAtual;
	private int totAndares;
	private int capElevador;
	private int qtdPessoas;
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotAndares() {
		return totAndares;
	}

	public void setTotAndares(int totAndares) {
		this.totAndares = totAndares;
	}

	public int getCapElevador() {
		return capElevador;
	}

	public void setCapElevador(int capElevador) {
		this.capElevador = capElevador;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public void inicializaElevador(int capacidade, int andares) {
		this.capElevador = capacidade;
		this.totAndares = andares;
	}
	
	public void entraElevador() {
		this.qtdPessoas++;
	}
	
	public void saiElevador() {
		this.qtdPessoas--;
	}
	
	public void sobeElevador() {
		this.andarAtual++;
	}
	
	public void desceElevador() {
		this.andarAtual--;
	}
}
