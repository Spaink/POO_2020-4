package aula12.as10b.exercicio02;

public abstract class FileComponets {
	
	String nomeArquivo;
	String nomePasta;
	int tamanhoArquivo;
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public String getNomePasta() {
		return nomePasta;
	}
	
	public int getTamanhoArquivo() {
		return tamanhoArquivo;
	}
	
	public void dadosArquivo() {
		System.out.println("Nome: " + this.nomeArquivo + " Tamanho: " + this.tamanhoArquivo + " KB");
	}
	
	public void nomePastas() {
		System.out.println("Nome: " + this.nomePasta);
	}
	
}
