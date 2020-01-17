package universidade;
import java.util.Scanner;

public class TestaCurso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Curso 01
		
		Curso c1 = new Curso();
		
		System.out.println("Entre com o nome do curso: ");
		c1.nome = sc.nextLine();
		
		System.out.println("Entre com a area do curso: ");
		c1.area = sc.nextLine();
		
		System.out.println("Entre com a duracao do curso: ");
		c1.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Entre com o tipo do curso: ");
		c1.tipo = sc.nextLine();
		
		System.out.println("Curso 1 : " + c1.nome + "-" + c1.area + " - " + c1.tipo + " - " + c1.duracao);
	
		//Curso 02
		
		Curso c2 = new Curso();
		
		System.out.println("Entre com o nome do curso: ");
		c2.nome = sc.nextLine();
		
		System.out.println("Entre com a area do curso: ");
		c2.area = sc.nextLine();
		
		System.out.println("Entre com a duracao do curso: ");
		c2.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Entre com o tipo do curso: ");
		c2.tipo = sc.nextLine();
		
		System.out.println("Curso 2 : " + c2.nome + "-" + c2.area + " - " + c2.tipo + " - " + c2.duracao);
		
		
	
	}
}
