package aula13.as11.exercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	
	private List <Pessoa> listaPessoas = new ArrayList <Pessoa> ();

	public Agenda() {
		
	}
	public void adicionaPessoa(String nome, int idade, float altura) {
		Pessoa p = new Pessoa(nome,idade,altura);
		listaPessoas.add(p);
	}
	
	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(List<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}

	public void armazenaPessoas(Pessoa p) {
		listaPessoas.add(p);
	}
	
	
	public void imprimeAgenda(List <Pessoa> pessoas) {
		System.out.println(pessoas.toString());
	}
	
}
