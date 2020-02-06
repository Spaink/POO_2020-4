package aula11.as09b.exercicio04;

public class Aplicacao {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger();
		log.setAtivo(true);
		
		log.log("PRIMEIRA MENSAGEM DE LOG");
		
		log.log("SEGUNDA MENSAGEM DE LOG");
	}

}
