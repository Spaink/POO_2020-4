package aula12.as10b.exercicio02;

import java.util.ArrayList;

public class FileComposite extends FileComponets {
	
	protected ArrayList <FileComponets> filesArquivos;
	
	public FileComposite(String nomePasta) {
		this.nomePasta = nomePasta;
		filesArquivos = new ArrayList<FileComponets>();
	}
	
	
	public void dadosArquivo() {
		System.out.println(this.nomePasta);
		for (FileComponets files : filesArquivos) {
			files.dadosArquivo();
		}
	}

	public void adicionarArquivo(FileComponets novoArquivo) {
		filesArquivos.add(novoArquivo);
	}

}
