package aula12.ex_sala_aula12.sigaa.salaaula.composite.seguro;

public abstract class ArquivoComponent {
	String nomeDoArquivo;

	public String getNomedoArquivo() {
		return this.nomeDoArquivo;
	}

	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
	}
}
