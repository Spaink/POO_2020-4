package aula01.ex_sala_de_aula01.numerosaleatorios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int maior, menor, qtd, soma = 0, qtd_pares = 0, qtd_impares = 0;
		
		System.out.println("Informe o primeiro número:");
		int n1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o segundo número:");
		int n2 = Integer.parseInt(sc.nextLine());
		
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		qtd = (maior - menor)-1;
		
		System.out.println("A quantidade de números no intervalo entre eles é : " + qtd);
		
		for(int i = menor + 1; i < maior; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos números do intervalo é : " + soma);
		
		double media = (double)soma/(double)qtd;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("A média dos números do intervalo é : " + df.format(media));
		
		for(int i = menor + 1; i < maior; i++) {
			if(i%2 == 0) {
				qtd_pares++;
			}else {
				qtd_impares++;
			}
		}
		
		System.out.println("A quantidade de números pares no intervalo é : " + qtd_pares);
		System.out.println("A quantidade de números ímpares no intervalo é : " + qtd_impares);
			
	}
}
