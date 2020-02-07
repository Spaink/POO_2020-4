package aula12.ex_sala_aula12.sigaa.salaaula.adapter.imagem;

public interface ImagemTarget {
	void carregarImagem(String nomeDoArquivo);

	void desenharImagem(int posX, int posY, int largura, int altura);
}
