package aula13.as11.exercicio03;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import aula13.as11.exercicio01.Agenda;
import aula13.as11.exercicio01.Pessoa;

public class Teste {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner ler = new Scanner(System.in);

		Agenda ag = new Agenda();

		 FileOutputStream arq = new FileOutputStream("src\\aula13\\as11\\exercicio03\\gravaPessoaBinario.dat");
	     DataOutputStream gravarArq = new DataOutputStream(arq);

		String nome;
		int idade;
		float altura;

		Pessoa[] p = new Pessoa[2];

		System.out.println("Informe o nome, idade e altura das pessoas:");

		for (int i = 0; i < 2; i++) {
			
			p[i] = new Pessoa();
			
			p[i].setNome(ler.next());
			nome = p[i].getNome();
			
			p[i].setIdade(ler.nextInt());
			
			idade = p[i].getIdade();
			
			p[i].setAltura(ler.nextFloat());
			altura = p[i].getAltura();
			
			gravarArq.writeUTF(nome);
	        gravarArq.writeInt(idade);
	        gravarArq.writeFloat(altura);
	        
			ag.adicionaPessoa(nome, idade, altura);
		}

		arq.close();
		
		System.out.println("Os dados das pessoas em binário foram gravadas com sucesso");
	}

}
