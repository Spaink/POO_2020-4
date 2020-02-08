package aula13.as11.exercicio02;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import aula13.as11.exercicio01.Pessoa;
import aula13.as11.exercicio01.Agenda;

public class Teste {

	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		Agenda ag = new Agenda();
		Pessoa p[] = new Pessoa[2];
		
		
		String nomePessoa = null;
		int idade = 0;
		float altura = 0;

        System.out.printf("Informe o nome do arquivo texto:\n");
        String nome = ler.nextLine();
        
        try {
        	
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            
            int cont = 0, i = 0;
            
            String linha = lerArq.readLine();
            nomePessoa = linha;
            while(linha != null){ 
            
                if(cont%3 == 0) {
                	nomePessoa = linha;    	
                }
                
                if(cont%3 == 1) {
                	idade = Integer.parseInt(linha);      	
                }
                
                if(cont%3 == 2) {
                	altura= Float.parseFloat(linha);  	
                }
                
                if(cont%3 == 2) {
                	p[i] = new Pessoa();
                	p[i].setNome(nomePessoa);
                	p[i].setIdade(idade);
                	p[i].setAltura(altura);
                	ag.armazenaPessoas(p[i]);
                	i++;
                }
                cont++;
                linha = lerArq.readLine();
            }
            
            arq.close();
            
        }catch (IOException e){
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
      
        ag.imprimeAgenda(ag.getListaPessoas());
	}

}
