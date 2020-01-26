package aula04.as04b.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		Funcionario f[] = new Funcionario[100];
		Endereco end[] = new Endereco[100];
		int matricula = 0,numero = 0, k =0;
		String nome, cpf, cargo, departamento,rua;
		double salario;
		System.out.println("Informe a matrícula do funcionário:");
		matricula = sc.nextInt();
		sc.nextLine();
		while(matricula != 0){
			
			System.out.println("Informe o nome:");
			nome = sc.nextLine();
			
			System.out.println("Informe o CPF:");
			cpf = sc.nextLine();
			
			System.out.println("Informe o Cargo:");
			cargo = sc.nextLine();
			
			System.out.println("Informe o Salario:");
			salario = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Informe o Departamento:");
			departamento = sc.nextLine();
			
			System.out.println("Informe a rua:");
			rua = sc.nextLine();
			
			System.out.println("Informe o numero:");
			numero =  sc.nextInt();
			
			end[k] = new Endereco(rua,numero);
			
			System.out.println("Informe a quadra:");
			end[k].setQuadra(sc.nextInt());
			
			System.out.println("Informe o lote:");
			end[k].setLote(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Informe o complemento:");
			end[k].setComplemento(sc.nextLine());
			
			System.out.println("Informe o bairro:");
			end[k].setBairro(sc.nextLine());
			
			System.out.println("Informe a cidade:");
			end[k].setCidade(sc.nextLine());
			
			System.out.println("Informe o estado:");
			end[k].setEstado(sc.nextLine());
			
			f[k] = new Funcionario(nome,cpf,matricula);
			f[k].setCargo(cargo);
			f[k].setSalario(salario);
			f[k].setDepartamento(departamento);
			f[k].setEnd(end[k]);
			
			listaFuncionarios.add(f[k]);
			k++;
			matricula = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i = 0; i < listaFuncionarios.size(); i++){
			System.out.println(f[i].toString());
		}
		for(int i = 0; i < listaFuncionarios.size(); i++){
			f[i].aumentaSalario(30);
			System.out.println(f[i].toString());
		}

	}

}
