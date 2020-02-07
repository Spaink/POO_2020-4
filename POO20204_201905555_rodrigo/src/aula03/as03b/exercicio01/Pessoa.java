package aula03.as03b.exercicio01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date data_nascimento;
	private double altura;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pessoa(){}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getData_nascimento() {
		return data_nascimento;
	}
	
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	int idade;
	
	public String toString() {	
		StringBuffer bf = new StringBuffer();	
		bf.append("\n Nome: " + this.getNome());
		bf.append("\n Data de Nascimento: " + formato.format(this.getData_nascimento()));
		bf.append("\n Altura: " + this.getAltura());
		bf.append("\n Idade: " + idade);
		return bf.toString();
	}
	
	int calculaIdade(int dia, int mes, int ano) {
		int  maior, menor;
		Date data = new Date();
		
    	Calendar cal = Calendar.getInstance();
    	
    	cal.setTime(data);
    	
    	int day = cal.get(Calendar.DAY_OF_MONTH);
    	int month = cal.get(Calendar.MONTH);
    	int year = cal.get(Calendar.YEAR);
    	
    	idade = year - ano;
    	
    	if(mes == month) {
    		idade++;
    	}else {
    		idade--;
    	}
    	
    	if(day > dia) {
    		maior = day;
    		menor = dia;
    	}else {
    		menor = day;
    		maior = dia;
    	}
    	
    	if(maior - menor == 30 && mes == month + 1) {
    		idade++;
    	}
    	
    	return idade;
    	
	}
}
