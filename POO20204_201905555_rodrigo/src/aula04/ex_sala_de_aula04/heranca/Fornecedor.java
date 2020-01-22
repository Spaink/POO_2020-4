package aula04.ex_sala_de_aula04.heranca;

public class Fornecedor extends PessoaJuridica {
	
	private String produtos;
	
	public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produtos){
		super(nome, endereco, telefone, cnpj, razaoSocial);
		this.produtos = produtos;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nProdutos do Fornecedor: " + this.getProdutos());
		return sb.toString();
	}
}
