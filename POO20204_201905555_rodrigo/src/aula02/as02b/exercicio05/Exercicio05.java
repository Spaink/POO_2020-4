package aula02.as02b.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas de sua familia:");
		int x = sc.nextInt();
		
		Familia f[] = new Familia[x];
		
		System.out.println("Informe o nome, idade, nome do pai e da mãe de cada membro familiar");
		System.out.println("Seguindo essa ordem --->");
		
		for(int i = 0; i < x; i++) {
			f[i] = new Familia();
			
			f[i].nome = sc.next();
			f[i].idade = sc.nextInt();
			f[i].nome_pai = sc.next();
			f[i].nome_mae = sc.next();
			
		}
		
		for(int i = 0; i < x; i++) {
			System.out.println(f[i].nome + " é filho(a) de " + f[i].nome_pai + " e " + f[i].nome_mae);
		}
		
		System.out.println("------Avós------");
		for(int i = 0; i < x; i++){
			if(f[i].idade >50 ) {
				System.out.println(f[i].nome);
			}
		}
		
		System.out.println("------Pais------");
		for(int i = 0; i < x; i++) {
				for(int j = 0; j < x; j++) {
					if(f[i].nome.equals(f[j].nome_pai)  || f[i].nome.equals(f[j].nome_mae)) {
						System.out.println(f[i].nome);
						break;
					}
				}	
		}
		
		System.out.println("------Filhos------");
		for(int i = 0; i < x; i++) {
				for(int j = 0; j < x; j++) {
					if(!f[i].nome.equals(f[j].nome_pai)  || !f[i].nome.equals(f[j].nome_mae)) {
						System.out.println(f[i].nome);
						break;
					}
				}	
		}
	}

}
