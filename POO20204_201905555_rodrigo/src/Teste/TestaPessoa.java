package Teste;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Endereco end = new Endereco("Goiânia","Goiás","R22","Vila Itatiaia",21,28);
		Pessoa p = new Pessoa("Rodrigo","Alves","059.637.631-69",80,20,1.80,end);
		
		System.out.println(p.toString());

	}

}
