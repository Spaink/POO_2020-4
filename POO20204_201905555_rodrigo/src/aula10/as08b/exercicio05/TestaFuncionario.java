package aula10.as08b.exercicio05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		//Exercicio 07
		
		Empresa emp = new Empresa();
		
		Funcionario f1 = new FuncionarioEnsinoBasico("Andre",7382,"Matos pena");
		emp.armazena01((FuncionarioEnsinoBasico)f1);
		Funcionario f2 = new FuncionarioEnsinoBasico("Andrei",9302,"Sem nome");
		emp.armazena01((FuncionarioEnsinoBasico)f2);
		Funcionario f3 = new FuncionarioEnsinoBasico("Arlei",8832,"Fim de Mundo!!!");
		emp.armazena01((FuncionarioEnsinoBasico)f3);
		Funcionario f4 = new FuncionarioEnsinoBasico("Arleizei",8192,"Impacto");
		emp.armazena01((FuncionarioEnsinoBasico)f4);
		
		Funcionario f5 = new FuncionarioEnsinoMedio("Marcelo",8932,"Jeruseva");
		emp.armazena02((FuncionarioEnsinoMedio)f5);
		Funcionario f6 = new FuncionarioEnsinoMedio("Marcos",9032,"Ave maria");
		emp.armazena02((FuncionarioEnsinoMedio)f6);
		Funcionario f7 = new FuncionarioEnsinoMedio("Madalena",7382,"Jerksk");
		emp.armazena02((FuncionarioEnsinoMedio)f7);
		Funcionario f8 = new FuncionarioEnsinoMedio("Manuel",7438,"Sei lá mano");
		emp.armazena02((FuncionarioEnsinoMedio)f8);
		
		Funcionario f9 = new FuncionarioEnsinoSuperior("Rodrigo",8028,"UFG");
		emp.armazena03((FuncionarioEnsinoSuperior)f9);
		Funcionario f10 = new FuncionarioEnsinoSuperior("Roger",8293,"Unicamp");
		emp.armazena03((FuncionarioEnsinoSuperior)f10);
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		double salarioTot01, salarioTot02, salarioTot03, tot;
		
		salarioTot01 = emp.tot01();
		salarioTot02 = emp.tot02();
		salarioTot03 = emp.tot03();
		
		System.out.println("Salário total dos funcionários de Ensino Básico: " + df.format(salarioTot01) + " reais");
		System.out.println("Salário total dos funcionários de Ensino Médio: " + df.format(salarioTot02) + " reais");
		System.out.println("Salário total dos funcionários de Ensino Superior: " + df.format(salarioTot03) + " reais");
		
		tot = salarioTot01 + salarioTot02 + salarioTot03;
		
		System.out.println("O gasto total da empresa para o pagamento de salários aos funcionários é : " + df.format(tot) + " reais");
		
		//Exercicio 10
		
		List <Funcionario> listaFuncionarios = new ArrayList <Funcionario> ();
		
		Funcionario fuc1 = new FuncionarioEnsinoBasico("Andre",7382,250.00,"Matos pena");
		listaFuncionarios.add(fuc1);
		Funcionario fuc2 = new FuncionarioEnsinoBasico("Andrei",9302,250.00,"Sem nome");
		listaFuncionarios.add(fuc2);
		Funcionario fuc3 = new FuncionarioEnsinoBasico("Arlei",8832,250.00,"Fim de Mundo!!!");
		listaFuncionarios.add(fuc3);
		Funcionario fuc4 = new FuncionarioEnsinoBasico("Arleizei",8192,250.00,"Impacto");
		listaFuncionarios.add(fuc4);
		
		Funcionario fuc5 = new FuncionarioEnsinoMedio("Marcelo",8932,250.00,"Jeruseva");
		listaFuncionarios.add(fuc5);
		Funcionario fuc6 = new FuncionarioEnsinoMedio("Marcos",9032,250.00,"Ave maria");
		listaFuncionarios.add(fuc6);
		Funcionario fuc7 = new FuncionarioEnsinoMedio("Madalena",7382,250.00,"Jerksk");
		listaFuncionarios.add(fuc7);
		Funcionario fuc8 = new FuncionarioEnsinoMedio("Manuel",7438,600.00,"Sei lá mano");
		listaFuncionarios.add(fuc8);
		
		Funcionario fuc9 = new FuncionarioEnsinoSuperior("Rodrigo",8028,1500.00,"UFG");
		listaFuncionarios.add(fuc9);
		Funcionario fuc10 = new FuncionarioEnsinoSuperior("Roger",8293,600.00,"Unicamp");
		listaFuncionarios.add(fuc10);
		
		//Exercicio11
		for(Funcionario f : listaFuncionarios){
			System.out.println(f.toString());
		}
		
	}

}
