package aula11.as09b.exercicio02;

public class FactoryVisualizador extends CreateVisualizador {

	@Override
	public Visualizador criaVisualizador(String tipoImagem) {
		Visualizador vis = null;
		if (tipoImagem.equalsIgnoreCase("BPM")) {
			 vis =  new VisualizadorBPM();
		}else if (tipoImagem.equals("JPG")){
			vis =  new VisualizadorJPG();
		}else {
			throw new IllegalArgumentException("Esse tipo de imagem é inválido");
		}	
		return vis;
	}

}
