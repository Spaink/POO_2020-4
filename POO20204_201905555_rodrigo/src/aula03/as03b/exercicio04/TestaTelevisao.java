package aula03.as03b.exercicio04;

import java.util.Scanner;

public class TestaTelevisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ControleRemoto cr = new ControleRemoto();
		
		Televisao t = new Televisao();
		
		System.out.println("Informe o canal:");
		t.setCanais(sc.nextInt());
		
		System.out.println("Informe o volume do canal:");
		t.setSom(sc.nextInt());
		
		System.out.println("#############Controle############");
		System.out.println("1 - Aumentar o volume");
		System.out.println("2 - Diminuir o Volume");
		System.out.println("3 - Trocar de Canal");
		System.out.println("4 - Ver o volume do Canal");
		System.out.println("5 - VerCanal");
		System.out.println("6 - sair ");
		
		int op = sc.nextInt();
		
		while(op!=6){
			switch(op) {
				case 1:
					cr.aumentaVolume(t);
					break;
				case 2:
					cr.diminuiVolume(t);
					break;
				case 3:
					System.out.println("Informe o canal desejado:");
					int k = sc.nextInt();
					cr.trocaCanal(k,t);
					break;
				case 4:
					int p = cr.verSom(t);
					System.out.println("Som : " + p);
					break;
				case 5:
					int l = cr.verCanal(t);
					System.out.println("Canal : " + l);
					break;
				case 6:
					break;
				default:
					System.out.println("Operação inválida!!!!");
			}
			
			System.out.println("#############Controle############");
			System.out.println("1 - Aumentar o volume");
			System.out.println("2 - Diminuir o Volume");
			System.out.println("3 - Trocar de Canal");
			System.out.println("4 - Ver o volume do Canal");
			System.out.println("5 - Ver Canal");
			System.out.println("6 - sair ");
			op = sc.nextInt();
			
		}
		
	}

}
