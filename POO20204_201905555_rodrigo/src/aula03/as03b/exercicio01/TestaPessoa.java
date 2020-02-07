package aula03.as03b.exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		
		Pessoa p1 = new Pessoa();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		p1.setNome("Rodrigo");
		

		Date data = formato.parse("24/05/1999");
		p1.setData_nascimento(data);
		
		p1.setAltura(1.80);
		
		p1.calculaIdade(24, 5, 1999);
		
		System.out.println("Seus dados são: ");
		System.out.println(p1.toString());	
		
	}

}
