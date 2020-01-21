package aula02.as02b.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p[] = new Pessoa[3];
		
		for(int i = 0; i < 3; i++){
			p[i] = new Pessoa();
			
			System.out.println("Informe o nome da pessoa:");
			p[i].nome = sc.next();
			
			System.out.println("Informe a idade da pessoa:");
			p[i].idade = sc.nextInt();
		}
		for(int i = 2; i > 0; --i) {
			for(int j = 0; j < i; ++j){
				if(p[j].idade >p[j+1].idade ){
					Pessoa aux = new Pessoa();
					aux.idade = p[j].idade;
					p[j].idade = p[j+1].idade;
					p[j+1].idade = aux.idade;
				}
			}
		}
		System.out.println("O mais velho é o(a) :" + p[2].nome);
		System.out.println("O mais novo é o(a) : " + p[0].nome);
	}

}
