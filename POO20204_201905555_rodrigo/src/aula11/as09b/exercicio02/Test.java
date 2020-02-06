package aula11.as09b.exercicio02;

public class Test {

	public static void main(String[] args) {
		
		FactoryVisualizador fac = new FactoryVisualizador();
		
		Visualizador vis = fac.criaVisualizador("JPG");
		
		vis.Visualizar();
		
		vis = fac.criaVisualizador("BPM");
		
		vis.Visualizar();
		
		vis = fac.criaVisualizador("JPEG");
		
		vis.Visualizar();

	}

}
