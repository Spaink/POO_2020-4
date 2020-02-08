package aula13.as11.exercicio04;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import aula13.as11.exercicio01.Agenda;
import aula13.as11.exercicio01.Pessoa;

public class Teste {

	public static void main(String[] args) throws IOException {
		
		Agenda ag = new Agenda();
		Pessoa p[] = new Pessoa[2];
		
		String nome;
		int idade;
		float altura;
		
		FileInputStream arq = new FileInputStream("src\\aula13\\as11\\exercicio03\\gravaPessoaBinario.dat");
        DataInputStream lerArq = new DataInputStream(arq);
        
        for(int i = 0; i < 2; i++) {
        	p[i] = new Pessoa();
        	
        	nome = lerArq.readUTF();
            idade = lerArq.readInt();
            altura = lerArq.readFloat();
            
            p[i].setNome(nome);
            p[i].setIdade(idade);
            p[i].setAltura(altura);
            
            ag.armazenaPessoas(p[i]);
            
        }
       
        ag.imprimeAgenda(ag.getListaPessoas());

	}

}
