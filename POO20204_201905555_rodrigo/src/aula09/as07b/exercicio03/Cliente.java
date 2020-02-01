package aula09.as07b.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String telefone;
	
	private List <Venda> vendas = new ArrayList <Venda> ();
	
	public Cliente(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
		
	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void armazenaVenda(Venda v) {
		vendas.add(v);
	}
	
	public void listaVendas(List <Venda> vendas){
		System.out.println(vendas.toString());
	}
	
	public void imprimir() {
		for(Venda v : this.vendas) {
			System.out.println(v.getObraArte().getTitulo());
		}
	}
	
}
