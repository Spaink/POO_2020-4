package aula06.ex_sala_de_aula06.endereco;

public class Endereco {
	private String numero;
	private String complemento;
	private Integer cep;
	private String tipo;
	private Bairro bairro;
	private Logradouro logradouro;
	
	public Endereco(String numero, String complemento, Integer cep, String tipo, Bairro bairro, Logradouro log) {
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.tipo = tipo;
		this.bairro = bairro;
		this.logradouro = log;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Imprimindo os Dados de Endere�o: ");
		sb.append("\nTipo do Endere�o:" + this.getTipo());
		sb.append("\n" + this.getLogradouro().getTipo().toString());
		sb.append("\n" + this.getLogradouro().getNome());
		sb.append("\n" + this.getNumero());
		sb.append("\n" + this.getComplemento());
		sb.append("\n" + this.getCep());
		sb.append("\n" + this.getBairro().getNome());
		sb.append("\n" + this.getBairro().getMunicipio().getNome());
		sb.append("\n" + this.getBairro().getMunicipio().getEstado().getNome());
		sb.append("\n" + this.getBairro().getMunicipio().getEstado().getPais());
		return sb.toString();
	}
	
	
}
