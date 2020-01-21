package aula01.as01c.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[3];
		
		System.out.println("Informe os 3 números");
		
		for(int i = 0; i < 3; i++) {
			vet[i] = sc.nextInt();
		}
		
		for(int i = 2; i > 0; --i){
			for(int j = 0; j < i; ++j) {
				int aux;
				if(vet[j] > vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(vet[i] + " ");
		}
		
	}

}
