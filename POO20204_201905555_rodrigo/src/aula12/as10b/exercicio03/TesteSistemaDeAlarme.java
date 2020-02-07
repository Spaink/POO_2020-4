package aula12.as10b.exercicio03;

public class TesteSistemaDeAlarme {

	public static void main(String[] args) {
		
		SistemaDeAlarme sis = new SistemaDeAlarme();
		Delegacia del = new Delegacia();
		CiaSeguros cia = new CiaSeguros();
		
		Sensores s = new Sensores();
		
		s.registraObservador(sis);
		s.registraObservador(del);
		s.registraObservador(cia);
		
		s.setMovimento(true);

	}

}
