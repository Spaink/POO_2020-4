package Sala_de_aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Intervalo x = new Intervalo();
		int maior, menor, qtd, soma, qtd_pares, qtd_impares;
		
		System.out.println("Informe o primeiro número:");
		x.n1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o segundo número:");
		x.n2 = Integer.parseInt(sc.nextLine());
		
		qtd = x.qtd(x.n1,x.n2);
		
		System.out.println("A quantidade de números no intervalo entre eles é : " + qtd);
		
		menor = x.menor(x.n1,x.n2);
		maior = x.maior(x.n1,x.n2);
		
		soma = x.soma(menor,maior);
		
		System.out.println("A soma dos números do intervalo é : " + soma);
		
		double media = (double)soma/(double)qtd;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("A média dos números do intervalo é : " + df.format(media));
		
		qtd_pares = x.pares(menor,maior);
		qtd_impares = x.impares(menor,maior);
		
		System.out.println("A quantidade de números pares no intervalo é : " + qtd_pares);
		System.out.println("A quantidade de números ímpares no intervalo é : " + qtd_impares);
			
	}
}
