package aula11.ex_sala_de_aula11.factory_method;

public class TesteApp {
	
	public static void main(String[] args) {
		
		 FabricaPessoa factory = new FabricaPessoa();
		 //Instanciando um Homem
		 factory.criaPessoa("Carlos","M");
		 
		 //Instanciando uma Mulher
		 factory.criaPessoa("Maria","F");
		 
		 try {
			 factory.criaPessoa("Erro","Z");
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }

	}
}
