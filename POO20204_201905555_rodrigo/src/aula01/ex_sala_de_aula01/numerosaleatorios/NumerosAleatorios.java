package aula01.ex_sala_de_aula01.numerosaleatorios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int maior, menor, qtd, soma = 0, qtd_pares = 0, qtd_impares = 0;
		
		System.out.println("Informe o primeiro n�mero:");
		int n1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o segundo n�mero:");
		int n2 = Integer.parseInt(sc.nextLine());
		
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		qtd = (maior - menor)-1;
		
		System.out.println("A quantidade de n�meros no intervalo entre eles � : " + qtd);
		
		for(int i = menor + 1; i < maior; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos n�meros do intervalo � : " + soma);
		
		double media = (double)soma/(double)qtd;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("A m�dia dos n�meros do intervalo � : " + df.format(media));
		
		for(int i = menor + 1; i < maior; i++) {
			if(i%2 == 0) {
				qtd_pares++;
			}else {
				qtd_impares++;
			}
		}
		
		System.out.println("A quantidade de n�meros pares no intervalo � : " + qtd_pares);
		System.out.println("A quantidade de n�meros �mpares no intervalo � : " + qtd_impares);
			
	}
}
