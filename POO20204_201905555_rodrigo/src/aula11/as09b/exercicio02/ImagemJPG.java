package aula11.as09b.exercicio02;

public class ImagemJPG extends Imagem {
	public void carregar() {
		System.out.println("Imagem JPG:");
		System.out.println("Carregando imagem JPG...");
		System.out.print("...");
		System.out.print("...");
		System.out.print("");
	}

	public void exibir() {
		System.out.println("Exibindo imagem por 20 segundos.");
	}

	public void fechar() {
		System.out.println("Fechando imagem.");
	}
}