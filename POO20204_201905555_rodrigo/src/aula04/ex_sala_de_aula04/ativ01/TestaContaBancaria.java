package aula04.ex_sala_de_aula04.ativ01;

import java.util.ArrayList;
import java.util.List;

public class TestaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNumero(84922);
		contaBancaria.setSaldo(1800.0d);
		contaBancaria.setLimite(1000.0d);
		contaBancaria.setTipo("Corrente");
		
		List <Cliente> clientes = new ArrayList <Cliente> ();
		
		Cliente cli01 = new Cliente();
		
		cli01.setNome("Rodrigo Alves de Sousa");
		cli01.setEndereco("Rua Sucupira n 35, Parque Amazonas, Goiânia - GO");
		cli01.setCpf("189.783.333-33");
		
		Cliente cli02 = new Cliente();
		
		cli01.setNome("Lara Costa Morgado");
		cli01.setEndereco("Rua Sucupira n 35, Parque Amazonas, Goiânia - GO");
		cli01.setCpf("893.331.384-99");
		
		clientes.add(cli01);
		clientes.add(cli02);
		
		contaBancaria.setTitulares(clientes);
		
		
		System.out.println("Nomes dos Titulares da conta:" );
		
		for(Cliente c : contaBancaria.getTitulares()){
			System.out.println(c.getNome());
		}

	}

}
