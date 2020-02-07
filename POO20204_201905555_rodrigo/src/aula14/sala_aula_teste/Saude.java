package aula14.sala_aula_teste;

public class Saude {
	int idade;
	double altura;
	double peso;
	
	public Saude(int idade, double altura, double peso) {
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public Saude(){}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calculaIMC() {
		double imc = peso/(altura*altura);
		return imc;
	}
	public String condicaoFisica() {
		double imc = calculaIMC();
		if(imc < 18.5) return "Abaixo do Peso";
		else if(imc <= 24.9) return "Peso Normal";
		else if (imc <= 29.9)return "sobrepeso";
		else return "Sobrepeso";
	}
	
}
