package aula12.ex_sala_aula12.sigaa.salaaula.adapter.imagem;

public class Cliente {
	public static void main(String[] args) {
		ImagemTarget imagem = new SDLImagemAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);

		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
