package aula12.ex_sala_aula12.sigaa.salaaula.adapter.imagem;

public class SDL_Surface {

	public void SDL_CarregarSurface(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void SDL_DesenharSurface(int largura, int altura, int posicaoX,
			int posicaoY) {
		System.out.println("SDL_Surface desenhada");
	}

}
