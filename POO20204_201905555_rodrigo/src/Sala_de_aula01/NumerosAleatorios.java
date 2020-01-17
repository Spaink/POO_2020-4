package Sala_de_aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Intervalo x = new Intervalo();
		int maior, menor, qtd, soma, qtd_pares, qtd_impares;
		
		System.out.println("Informe o primeiro n�mero:");
		x.n1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o segundo n�mero:");
		x.n2 = Integer.parseInt(sc.nextLine());
		
		qtd = x.qtd(x.n1,x.n2);
		
		System.out.println("A quantidade de n�meros no intervalo entre eles � : " + qtd);
		
		menor = x.menor(x.n1,x.n2);
		maior = x.maior(x.n1,x.n2);
		
		soma = x.soma(menor,maior);
		
		System.out.println("A soma dos n�meros do intervalo � : " + soma);
		
		double media = (double)soma/(double)qtd;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("A m�dia dos n�meros do intervalo � : " + df.format(media));
		
		qtd_pares = x.pares(menor,maior);
		qtd_impares = x.impares(menor,maior);
		
		System.out.println("A quantidade de n�meros pares no intervalo � : " + qtd_pares);
		System.out.println("A quantidade de n�meros �mpares no intervalo � : " + qtd_impares);
			
	}
}
