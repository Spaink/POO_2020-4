package aula06.ex_sala_de_aula06.endereco;

public class EnderecoTeste {
	public static void main(String[] args) {
		
		Pais pais = new Pais("Brasil");
		Estado goias = new Estado("GO","Goi�s", pais);
		Municipio municipio = new Municipio(new Long(25300),"Goi�nia",goias);
		Bairro bairro = new Bairro("Central", "Setor Central", municipio);
		Logradouro log = new Logradouro("Parana�ba", TipoLogradouro.AVENIDA);
		Endereco end = new Endereco("125", "qd. 45 lt.26A", 7383923, "Residencial",bairro,log);
		
		System.out.println(end.toString());
	}
}
