package aula13.as11.exercicio06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import aula13.as11.exercicio01.Agenda;
import aula13.as11.exercicio01.Pessoa;

public class Teste {

	public static void main(String[] args) throws IOException {
		
		Agenda ag = new Agenda();
		Pessoa p[] = new Pessoa[2];
		
		String nome;
		int idade;
		float altura;
		
		try {
            RandomAccessFile arquivo = new RandomAccessFile("src\\aula13\\as11\\exercicio05\\aleatorio.dat", "r");

            for (int i = 0; i < 2; i++){
            	p[i] = new Pessoa();
            	
            	nome = lerString(arquivo,20);
                idade = arquivo.readInt();
                altura = arquivo.readFloat();
                
                p[i].setNome(nome);
                p[i].setIdade(idade);
                p[i].setAltura(altura);
                
                ag.armazenaPessoas(p[i]);
            }
            arquivo.close();
        } catch (FileNotFoundException e) {
            System.err.printf("Arquivo não encontrado: %s.\n", e.getMessage());
        }
		
		ag.imprimeAgenda(ag.getListaPessoas());
		
	}
	
	private static String lerString(RandomAccessFile arq, int tam) throws IOException {
        char result[] = new char[tam];
        for (int i=0; i<tam; i++) {
            result[i] = arq.readChar();
        }
        return(new String(result).replace('\0', ' '));
    }

}
