package aula09.as07b.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class TestaGaleria02 {

	public static void main(String[] args) {

		List <Cliente> clientes = new ArrayList <Cliente>();
		
		Artista02 a1 = new Artista02("Rodrigo","24/05/1999","Anápolis-GO");
		Artista02 a2 = new Artista02("Marcos","28/09/1997","Goiânia-GO");
		Artista02 a3 = new Artista02("Leandro","12/03/1989","Ceres-GO");
		
		ObraDeArte02 ob1 = new ObraDeArte02("Sexta",894.44,"22/02/1900","Disponível","sei lá",a1);
		ObraDeArte02 ob2 = new ObraDeArte02("Quinta",8940.44,"21/01/1800","Disponível","sei lá",a3);
		ObraDeArte02 ob3 = new ObraDeArte02("Madrugada",694.44,"09/12/1999","Vendida","sei lá",a1);
		ObraDeArte02 ob4 = new ObraDeArte02("Choppada",9994.44,"15/06/2020","Disponível","sei lá",a2);
		ObraDeArte02 ob5 = new ObraDeArte02("Java",7314.44,"30/07/2020","Vendida","sei lá",a3);
		
		Cliente c1 = new Cliente("Marcelo","73829","(62)98555-8733");
		clientes.add(c1);
		Cliente c2 = new Cliente("Quinta","738392","(62)99445-8712");
		clientes.add(c2);
		
		Venda v1 = new Venda(c1,ob4,"12/07/2019");
		c1.armazenaVenda(v1);
		Venda v2 = new Venda(c1,ob3,"14/07/2019");
		c1.armazenaVenda(v2);
		Venda v3 = new Venda(c1,ob1,"12/07/2019");
		c1.armazenaVenda(v3);
		Venda v4 = new Venda(c2,ob5,"12/07/2019");
		c2.armazenaVenda(v4);
		
		c1.listaVendas(c1.getVendas());
		c2.listaVendas(c2.getVendas());
		
		System.out.println("Lista das Obras Vendidas");
		for(Cliente k : clientes) {
			k.imprimir();
		}

	}

}
