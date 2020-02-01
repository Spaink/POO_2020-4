package aula09.as07b.exercicio03;

import java.util.ArrayList;
import java.util.List;

import aula09.as07b.exercicio02.ObraDeArte;

public class Artista02 {
	
	private String nome;
	private String dataNascimento;
	private String localNascimento;
	
	private List <ObraDeArte02> obras = new ArrayList<ObraDeArte02>();
	
	public Artista02(String nome, String dataNascimento, String localNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.localNascimento = localNascimento;
	}
	
	public List<ObraDeArte02> getObras() {
		return obras;
	}

	public void setObras(List<ObraDeArte02> obras) {
		this.obras = obras;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	
	public void armazenaObra(ObraDeArte02 obra) {
		obras.add(obra);
	}
	
	public void listaObras(List <ObraDeArte02> obras) {
		System.out.println(obras.toString());
		System.out.println("\n");
	}
	
	public void imprimir() {
		for(ObraDeArte02 ob : this.obras) {
			System.out.println(ob.getTitulo());
		}
	}
}
