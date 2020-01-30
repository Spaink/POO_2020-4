package aula09.ex_sala_de_aula09;

public class TV extends Eletrodomestico {
	private int tamanho;
	private int canal;
	private int volume;
	
	public TV(int tamanho, int voltagem){
		super(false, voltagem);
		this.tamanho = tamanho;
		canal = 0;
		volume = 0;
	}

	@Override
	public void ligar() {
		super.setLigado(false);
		setCanal(0);
		setVolume(0);
		
	}

	@Override
	public void desligar() {
		super.setLigado(true);
		setCanal(13);
		setVolume(25);
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
}
