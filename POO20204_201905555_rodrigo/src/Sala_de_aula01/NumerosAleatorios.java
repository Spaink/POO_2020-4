package Sala_de_aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, maior, menor;
		
		System.out.println("Informe o primeiro número:");
		n1 = ler.nextInt();
		
		System.out.println("Informe o segundo número:");
		n2 = ler.nextInt();
		
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		
		int qtd_intervalo = (maior - menor)-1;
		
		if(qtd_intervalo < 0) {
			qtd_intervalo = (-1)*qtd_intervalo;
		}
		
		System.out.println("A quantidade de números no intervalo entre eles é : " + qtd_intervalo);
		
		int soma = 0;
		
		for(int i = menor+1; i <= maior-1; i++){
			 soma += i;
		}
		
		System.out.println("A soma dos números do intervalo é : " + soma);
		
		double media = (double)soma/(double)qtd_intervalo;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("A média dos números do intervalo é : " + df.format(media));
		
		int qtd_pares = 0, qtd_impares = 0;
		
		for(int i = menor+1; i <= maior-1; i++){
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
