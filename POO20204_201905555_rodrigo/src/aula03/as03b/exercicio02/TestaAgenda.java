package aula03.as03b.exercicio02;

import java.util.Scanner;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Agenda ag = new Agenda();
		
		Contato [] c = new Contato[2];
		System.out.println("Informe o nome, idade e altura das pessoas:");
		for(int i = 0; i < 2; i++) {
			c[i] = new Contato();
			c[i].setNome(sc.next());
			c[i].setIdade(sc.nextInt());
			c[i].setAltura(sc.nextFloat());
			c[i].setChave(i);
			ag.armazenaContato(c[i]);
		}
		System.out.println("#############Menu############");
		System.out.println("1 - Buscar Pessoa");
		System.out.println("2 - Imprimir a Agenda");
		System.out.println("3 - Imprimir o Contato");
		System.out.println("4 - Remover Contato");
		System.out.println("5 - sair ");
		int op = sc.nextInt();
		while(op!=5){
			switch(op) {
				case 1:
					System.out.println("Informe o nome do Contato:");
					String nome = sc.nextLine();
					int pos  = ag.buscaContato(nome);
					if(pos != -1) {
						System.out.println(nome + " foi encontrado na posição: " + pos);
					}else {
						System.out.println("O nome informado não está na Agenda!!!");
					}
					break;
				case 2:
					ag.imprimeAgenda(ag.getListaContatos());
					break;
				case 3:
					System.out.println("Informe a chave do Contato que deseja imprimir:");
					int id = sc.nextInt();
					if(id > 9 || id < 0) {
						System.out.println("Chave não encontrada");
					}else {
						ag.imprimeContato(id);
					}
					break;
				case 4:
					System.out.println("Informe o nome do Contato que gostaria de remover:");
					String l = sc.nextLine();
					ag.removeContato(l);
					break;
				case 5:
					break;
				default:
					System.out.println("Operação inválida!!!!");
			}
			System.out.println("#############Menu############");
			System.out.println("1 - Buscar Pessoa");
			System.out.println("2 - Imprimir a Agenda");
			System.out.println("3 - Imprimir o Contato");
			System.out.println("4 - Remover Contato");
			System.out.println("5 - sair ");
			op = sc.nextInt();
			sc.nextLine();
		}
	}

}
