package aula12.ex_sala_aula12.sigaa.salaaula.adapter.imagem;

public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {

	public void carregarImagem(String nomeDoArquivo) {
		glCarregarImagem(nomeDoArquivo);
	}

	public void desenharImagem(int posX, int posY, int largura, int altura) {
		glDesenharImagem(posX, posY);
	}

}
