package aula03.as03b.exercicio03;

import java.util.Scanner;

public class TestaElevador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Elevador e = new Elevador();
		
		int k, p;
		
		System.out.println("Informe a capacidade de pessoas do elevador:");
		k = sc.nextInt();
		
		System.out.println("Informe a quantidade de andares do prédio:");
		p = sc.nextInt();
		
		e.inicializaElevador(k,p);
		System.out.println("Informe o andar atual:");
		e.setAndarAtual(sc.nextInt());
		
		System.out.println("Informe a quantidade de pessoas no elevador:");
		e.setQtdPessoas(sc.nextInt());
		
		System.out.println("#############Menu############");
		System.out.println("1 - Subir o elevador");
		System.out.println("2 - Descer o elevador");
		System.out.println("3 - Entrar pessoa");
		System.out.println("4 - Sair pessoa");
		System.out.println("5 - sair ");
		
		int op = sc.nextInt();
		
		while(op!=5){
			switch(op) {
				case 1:
					int andar_atual  = e.getAndarAtual();
					if(andar_atual > e.getTotAndares()) {
						System.out.println("Não é possivel subir mais");
					}else {
						e.sobeElevador();
					}
					break;
				case 2:
					int andar_atual2  = e.getAndarAtual();
					if(andar_atual2 == 0) {
						System.out.println("Não é possivel descer mais");
					}else {
						e.desceElevador();
					}
					break;
				case 3:
					int qtd = e.getQtdPessoas();
					if(qtd > e.getCapElevador()) {
						System.out.println("Não é possivel entrar mais uma pessoa");
					}else {
						e.entraElevador();
					}
					break;
				case 4:
					int qtd2 = e.getQtdPessoas();
					if(qtd2 == 0) {
						System.out.println("Não é possivel sair mais uma pessoa");
					}else {
						e.saiElevador();
					}
					break;
				case 5:
					break;
				default:
					System.out.println("Operação inválida!!!!");
			}
			System.out.println("#############Menu############");
			System.out.println("1 - Subir o elevador");
			System.out.println("2 - Descer o elevador");
			System.out.println("3 - Entrar pessoa");
			System.out.println("4 - Sair pessoa");
			System.out.println("5 - sair ");
			op = sc.nextInt();
		}
		
		System.out.println("Final da Operação: ");
		System.out.println("Andar atual: " + e.getAndarAtual() + " Capacidade do elevador: " + e.getCapElevador() + " Quantidade de pessoas: " + e.getQtdPessoas() + " Total de Andares: " + e.getTotAndares());

	} 

}
