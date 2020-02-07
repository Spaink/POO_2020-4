package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

public class SistemaDeAlarme implements Observer {
		
	@Override
	public void update(Observable SistemaDeAlarme, Object Sensores) {
		if(true) {
			System.out.println("Ligando para a Delegacia e contatando a Cia.Seguros");
		}
	}

}
