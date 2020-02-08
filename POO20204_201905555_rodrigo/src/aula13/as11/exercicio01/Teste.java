package aula13.as11.exercicio01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException{
		
		Scanner ler = new Scanner(System.in);

		Agenda ag = new Agenda();
		
		FileWriter arq = new FileWriter("src\\aula13\\as11\\exercicio01\\gravaPessoa.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

		String nome;
		int idade;
		float altura;
		
		Pessoa[] p = new Pessoa[2];
		
		System.out.println("Informe o nome, idade e altura das pessoas:");
		
		for (int i = 0; i < 2; i++) {
			p[i] = new Pessoa();
			p[i].setNome(ler.next());
			nome = p[i].getNome();
			gravarArq.printf(nome + "\n");
			p[i].setIdade(ler.nextInt());
			idade = p[i].getIdade();
			gravarArq.printf(idade + "\n");
			p[i].setAltura(ler.nextFloat());
			altura = p[i].getAltura();
			gravarArq.printf(altura + "\n");
			ag.adicionaPessoa(nome,idade,altura);
		}
		
		arq.close();
		
		System.out.println("Os dados das pessoas foram gravados com sucesso no arquivo.");

	}

}
