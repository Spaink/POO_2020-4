package aula02.as02b.exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro c = new Carro();
		
		System.out.println("Informe o custo de fábrica do carro:");
		c.custo_fabrica = sc.nextDouble();
		
		double custo = c.custo_carro(c.custo_fabrica);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("O preço do carro será de : " + df.format(custo) + " reais");

	}

}
