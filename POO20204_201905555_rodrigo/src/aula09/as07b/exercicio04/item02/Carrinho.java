package aula09.as07b.exercicio04.item02;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List <Produtos> listaProdutos = new ArrayList <Produtos>();

	public List<Produtos> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produtos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void armazenarProduto(Produtos p) {
		listaProdutos.add(p);
	}
	
	public void exibirProdutos(List <Produtos> p) {
		System.out.println(p.toString());
	}
}
