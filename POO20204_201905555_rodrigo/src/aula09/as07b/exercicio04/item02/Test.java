package aula09.as07b.exercicio04.item02;

public class Test {

	public static void main(String[] args) {
		
		Carrinho c = new Carrinho();
		
		Produtos p1 = new Produtos(78,18.2,1);
		c.armazenarProduto(p1);
		Produtos p2 = new Produtos(44,22.2,4);
		c.armazenarProduto(p2);
		Produtos p3 = new Produtos(23,89.2,10);
		c.armazenarProduto(p3);
		Produtos p4 = new Produtos(90,21.2,3);
		c.armazenarProduto(p4);
		Produtos p5 = new Produtos(34,98.2,1);
		c.armazenarProduto(p5);
		
		System.out.println("Lista de Produtos no Carrinho");
		c.exibirProdutos(c.getListaProdutos());

	}

}
