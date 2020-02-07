package aula12.ex_sala_aula12.sigaa.salaaula.adapter.imagem;

public class OpenGLImage {

	public void glCarregarImagem(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void glDesenharImagem(int posicaoX, int posicaoY) {
		System.out.println("OpenGL Image desenhada");
	}
}
