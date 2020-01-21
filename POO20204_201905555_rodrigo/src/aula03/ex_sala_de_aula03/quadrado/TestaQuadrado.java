package aula03.ex_sala_de_aula03.quadrado;

public class TestaQuadrado {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		
		q1.cor = "verde";
		q2.cor = "vermelho";
		q3.cor = "amarelo";
		
		System.out.println(" Cor do quadrado q1: " + q1.cor);
		System.out.println(" Cor do quadrado q2: " + q2.cor);
		System.out.println(" Cor do quadrado q3: " + q3.cor);
		System.out.println(" Cor da classe quadrado: " + Quadrado.cor);
	}

}
