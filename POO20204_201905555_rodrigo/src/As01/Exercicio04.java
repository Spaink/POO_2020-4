package As01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		String telefone;
		
		System.out.println("Informe o seu nome:");
		nome = sc.nextLine();
		
		int cond_n = 0;
		char c;
		for(int i = 0; i < nome.length(); i++) {
			
			c = nome.charAt(i);
			
			if(Character.isDigit(c)==true){
				System.out.println("O nome � inv�lido, ele n�o pode ter n�meros");
				cond_n = 1;
				break;
			}
		}
		
		if(cond_n == 0) {
			System.out.println("O nome � v�lido");
		}
		
		int cond_t = 0;
		
		System.out.println("Informe o seu Telefone");
		telefone = sc.nextLine();
		
		char t;
		
		for(int i = 0; i < telefone.length(); i++) {
			
			t = telefone.charAt(i);
			
			if(Character.isDigit(t)==false){
				System.out.println("O telefone � inv�lido, ele n�o pode ter letras");
				cond_t = 1;
				break;
			}
		}
		
		if(cond_t == 0) {
			System.out.println("O telefone � v�lido");
		}

	}

}
