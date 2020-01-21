package aula03.ex_sala_de_aula03.pessoa;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	final String especie  = "mamifero"; 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
