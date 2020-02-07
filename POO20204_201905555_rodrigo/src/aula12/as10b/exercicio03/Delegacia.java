package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

public class Delegacia implements Observer {
	
	@Override
	public void update(Observable Delegacia, Object Sensores) {
		if(true) {
			System.out.println("A Delegacia foi notificada sobre o ocorrido");
		}
	}

}
