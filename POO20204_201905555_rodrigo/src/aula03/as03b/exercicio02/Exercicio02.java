package aula03.as03b.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Agenda pessoas[] = new Agenda[2];
		
		System.out.println("Informe o nome, idade e altura das pessoas:");
		for(int i = 0; i < 2; i++) {
			pessoas[i] = new Agenda();
			String nome = sc.next();
			int idade = sc.nextInt();
			float altura = sc.nextFloat();
			pessoas[i].armazenaPessoa(nome,idade,altura);
			
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("Nome: " + pessoas[i].getNome());
			System.out.println("Idade: " + pessoas[i].getIdade());
			System.out.println("Altura: " + pessoas[i].getAltura());
			
		}
	}

}
