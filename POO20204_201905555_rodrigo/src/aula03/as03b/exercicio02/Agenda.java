package aula03.as03b.exercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	
	private List <Contato> listaContatos = new ArrayList <Contato> ();

	public Agenda() {
		
	}
	public void adicionaPessoa(String nome, int idade, float altura) {
		Contato c = new Contato(nome,idade,altura);
		listaContatos.add(c);
	}
	public List<Contato> getListaContatos() {
		return listaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	public void armazenaContato(Contato c) {
		listaContatos.add(c);
	}
	
	public void removeContato(String nome) {
		Iterator<Contato> iterator = listaContatos.iterator();
		int qContatos = listaContatos.size();
		while(iterator.hasNext()) {
			Contato removeContato = iterator.next();
			if(removeContato.getNome().equals(nome)) {
				iterator.remove();
			}
		}
		int nContatos= listaContatos.size();
		if(nContatos < qContatos) {
			System.out.println(nome + " foi removido com sucesso");
		}
		else
			System.out.println("O contato " + nome + " não existe na lista");
	}
	
	public int buscaContato(String nome) {
		int id = 0;
		for(Contato cont : this.listaContatos) {
			if(cont.getNome().equals(nome)) {
				id = cont.getChave();
			}else {
				id = -1;
			}
		}
		
		return id;
	}
	
	public void imprimeAgenda(List <Contato> contatos) {
		System.out.println(contatos.toString());
	}
	
	public void imprimeContato(int index) {
		Contato k = new Contato();
		k = null;
		for(Contato c : this.listaContatos) {
			if(c.getChave() == index){
				k = c;
			}
		}
		if(k == null) {
			System.out.println("Não possui nenhum contato na Agenda com esse número");
		}else {
			System.out.println(k);
		}
	}
	
}
