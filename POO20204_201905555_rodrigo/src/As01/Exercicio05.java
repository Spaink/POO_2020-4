package As01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de funcion�rio:");
		int k = sc.nextInt();
		
		Funcionario f[] = new Funcionario[k];
		
		double salarios[] = new double[k];
		double soma = 0;
		int qtd = k;
		
		System.out.println("Informe o Nome e o sal�rio de cada funcion�rio:");
		
		for(int i = 0; i < k; i++) {
			
			f[i] = new Funcionario();
			
			f[i].nome = sc.next();
			f[i].salario =  sc.nextDouble();
			salarios[i] = f[i].salario;
			soma += salarios[i];
		}
		
		double media = soma/qtd;
		
		for (int i = k-1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (salarios[j] > salarios[j+1]) {
                    double aux = salarios[j];
                    salarios[j] = salarios[j+1];
                    salarios[j+1] = aux;
	             }
	         }
	      }
		
		double maior = salarios[k-1];
		double menor = salarios[0];
		
		for(int i = 0; i < k; i++ ) {
			if(maior == f[i].salario) {
				System.out.println("Posi��o: " + i + " - Nome: " + f[i].nome + " - Sal�rio: " +f[i].salario);
				break;
			}
		}
		
		for(int i = 0; i < k; i++ ) {
			if(menor == f[i].salario) {
				System.out.println("Posi��o: " + i + " - Nome: " + f[i].nome + " - Sal�rio: " +f[i].salario);
				break;
			}
		}
		
		System.out.println("A m�dia sal�rial �: " + media);
		System.out.println("Pessoas com o sal�rio acima da m�dia");
		for(int i = 0; i < k; i++ ) {
			if(f[i].salario > media) {
				System.out.println("Nome: " + f[i].nome + " - Sal�rio: " +f[i].salario);
			}
		}
		System.out.println("Pessoas com o sal�rio abaixo da m�dia");
		for(int i = 0; i < k; i++ ) {
			if(f[i].salario <= media) {
				System.out.println("Nome: " + f[i].nome + " - Sal�rio: " +f[i].salario);
			}
		}
	}

}
