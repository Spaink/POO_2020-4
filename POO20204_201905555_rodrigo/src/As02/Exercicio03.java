package As02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de habitantes:");
		int k = sc.nextInt();
		
		Habitante hbs[] = new Habitante[k];
		
		System.out.println(" Informe o sexo, cor dos olhos, cor dos cabelos e idade:");
		for(int i = 0; i < k; i++) {
			hbs[i] = new Habitante();
			hbs[i].sexo = sc.next();
			hbs[i].cor_olhos = sc.next();
			hbs[i].cor_cabelos = sc.next();
			hbs[i].idade = sc.nextInt();
		}
		
		for (int i = k-1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (hbs[j].idade > hbs[j+1].idade) {
                    Habitante aux = new Habitante();
                    aux.idade = hbs[j].idade;
                    hbs[j].idade = hbs[j+1].idade;
                    hbs[j+1].idade = aux.idade;
	             }
	         }
	      }
		System.out.println("A maior idade é : " + hbs[k-1].idade);
		
		int qtd = 0;
		
		for(int i = 0; i < k; i++) {
			if(hbs[i].sexo.equals("feminino")) {
				if(hbs[i].idade >= 18 && hbs[i].idade <= 35) {
					if(hbs[i].cor_cabelos.equals("louros") && hbs[i].cor_olhos.equals("verdes")){
						qtd++;
					}
				}
			}
		}
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		double percentual = ((double)qtd/(double)k)*100;
		
		System.out.println("O Percentual de mulheres loira com olhos verdes de 18 a 35 anos é " + df.format(percentual) + "%");
	}
}
