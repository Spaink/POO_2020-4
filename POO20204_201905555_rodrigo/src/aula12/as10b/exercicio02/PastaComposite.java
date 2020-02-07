package aula12.as10b.exercicio02;

import java.util.ArrayList;

public class PastaComposite extends FileComponets {

	protected ArrayList<FileComponets> filesPastas;

	public PastaComposite(String nomePasta) {
		this.nomePasta = nomePasta;
		filesPastas = new ArrayList<FileComponets>();
	}

	public void nomePastas() {
		System.out.println(this.nomePasta);
		for (FileComponets files : filesPastas) {
			files.nomePastas();
		}
	}
	
	public void adicionarPasta(FileComponets novaPasta) {
		filesPastas.add(novaPasta);
	}
}
