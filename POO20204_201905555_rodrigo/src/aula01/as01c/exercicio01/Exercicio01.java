package aula01.as01c.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos");
		int qtd = sc.nextInt();

		Aluno alunos[] = new Aluno[qtd];
		
		for(int i = 0 ; i < qtd; i++){	
			
			alunos[i] = new Aluno();
			
			System.out.println("Entre com o nome do aluno:");
			alunos[i].nome = sc.next();
			System.out.println("Entre com a matrícula do aluno:");
			alunos[i].matricula = sc.nextInt();
		}
		System.out.println("Lista de Alunos: ");
		for(int i = 0 ; i < qtd; i++){
			System.out.println("Aluno :  " + alunos[i].nome + " - matricula : " + alunos[i].matricula);
		
		}
	}

}
