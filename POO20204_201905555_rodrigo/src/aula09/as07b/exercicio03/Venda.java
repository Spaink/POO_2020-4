package aula09.as07b.exercicio03;

public class Venda {
	
	private Cliente cliente;
	private ObraDeArte02 obraArte;
	private String dataVenda;
	
	public Venda(Cliente cliente, ObraDeArte02 obraArte, String dataVenda) {
		this.cliente = cliente;
		this.obraArte = obraArte;
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ObraDeArte02 getObraArte() {
		return obraArte;
	}

	public void setObraArte(ObraDeArte02 obraArte) {
		this.obraArte = obraArte;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public void exibirVenda() {
		System.out.println(toString());
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nCliente: " + this.getCliente().getNome() );
		sb.append("\nTítulo da Obra: " + this.getObraArte().getTitulo());
		sb.append("\nData da Venda: " + this.getDataVenda());
		return sb.toString();
	}
	
}
