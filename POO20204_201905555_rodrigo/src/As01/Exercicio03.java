package As01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números:");
		int x = sc.nextInt();
		
		int v[] = new int[x];
		
		System.out.println("Digite os números");
		
		for(int i = 0; i < x; i ++){
			v[i] = sc.nextInt();
		}
		
		 for (int i = x-1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
	             }
	         }
	      }
		 
		 System.out.println("Ordem crescente");
		 for(int i = 0; i < x; i ++){
				System.out.print(v[i] + " ");
		 }
		 
		 System.out.println();
		 
		 System.out.println("Ordem decrescente");
		 for(int i = x-1; i >= 0; i --){
				System.out.print(v[i] + " ");
		 }
		 
		 System.out.println();
		 
		 System.out.println("Informe um valor para a pesquisa:");
		 
		 int p = sc.nextInt();
		 int pos = 0;
		 
		 for(int i = 0; i < x; i++){
			if(p == v[i]) {
				pos = i;
				System.out.println("Valor encontrado na posição: " + pos);
				break;
			}else {
				pos = -1;
			}
		 }
		 
		 if(pos == -1) {
				System.out.println("Valor não encontrado!!!");
		}
	}
}
