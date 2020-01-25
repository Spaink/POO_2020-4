package aula04.ex_sala_de_aula04.heranca;

public class HerancaTeste {

	public static void main(String[] args) {
		
		Pessoa cliente = new Cliente("Rodrigo", "Goiânia","738-299","892","Solteiro","Masculino",9000.00,"Engenheiro de Software");
		
		System.out.println("Dados do Cliente: " + cliente.toString());
		
		if(cliente instanceof Cliente){
			Cliente c = (Cliente) cliente;
			c.adicionarInteresse("Futebol");
			c.adicionarInteresse("Literatura");
			String algumInteresse = c.consultaInteresse("Futebol");
			if(algumInteresse != null) {
				System.out.println(algumInteresse);
			}else {
				System.out.println("Interesse não encontrado");
			}
			
			System.out.println(c.getInteresses().toString());
			
			c.removeInteresse("Games");
			
			System.out.println(c.getInteresses().toString());
		}
	}

}
