package aula11.as09b.exercicio02;

public class VisualizadorBPM extends Visualizador {
		public void Visualizar() {
			Imagem img = new Imagem();
			img.carregar();
			img.exibir();
			img.fechar();
		}
}
