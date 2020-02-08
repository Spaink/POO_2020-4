package aula13.as11.exercicio05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import aula13.as11.exercicio01.Agenda;
import aula13.as11.exercicio01.Pessoa;

public class Teste {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Agenda ag = new Agenda();
		Pessoa p[] = new Pessoa[2];
		
		String nome;
		int idade;
		float altura;
		
		Scanner ler = new Scanner(System.in);
		
		RandomAccessFile arquivo = new RandomAccessFile("src\\aula13\\as11\\exercicio05\\aleatorio.dat","rw");
		arquivo.seek(arquivo.length());
		
		System.out.println("Informe o nome, idade e altura das pessoas:");
		
		for(int i = 0; i < 2; i++) {
			p[i] = new Pessoa();
			
			p[i].setNome(ler.next());
			
			nome = p[i].getNome();
			
			p[i].setIdade(ler.nextInt());
			idade = p[i].getIdade();

			p[i].setAltura(ler.nextFloat());
			altura = p[i].getAltura();

			ag.adicionaPessoa(nome,idade,altura);
			
			gravarString(arquivo, nome, 20);
            arquivo.writeInt(idade);
            arquivo.writeFloat(altura);
		}
		
		arquivo.close();
		
		System.out.println("Os dados foram gravados com sucesso no arquivo!!!");

	}

	private static void gravarString(RandomAccessFile arquivo, String nome, int i) throws IOException {
		StringBuilder result = new StringBuilder(nome);
	    result.setLength(i);
	    arquivo.writeChars(result.toString());
		
	}

}
