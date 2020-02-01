package aula09.as07b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Artista {
	
	private String nome;
	private String dataNascimento;
	private String localNascimento;
	
	private List <ObraDeArte> obras = new ArrayList<ObraDeArte>();
	
	public Artista(String nome, String dataNascimento, String localNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.localNascimento = localNascimento;
	}
	
	public List<ObraDeArte> getObras() {
		return obras;
	}

	public void setObras(List<ObraDeArte> obras) {
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
	
	public void armazenaObra(ObraDeArte obra) {
		obras.add(obra);
	}
	
	public void listaObras(List <ObraDeArte> obras) {
		System.out.println(obras.toString());
		System.out.println("\n");
	}
	
	public void imprimir() {
		for(ObraDeArte ob : this.obras) {
			System.out.println(ob.getTitulo());
		}
	}
}
