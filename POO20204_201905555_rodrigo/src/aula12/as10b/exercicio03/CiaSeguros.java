package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

public class CiaSeguros implements Observer {

	@Override
	public void update(Observable CiaSeguros, Object Sensores) {
		if(true) {
			System.out.println("A Cia.Seguros foi contatada e entrará em contato com você em breve");
		}
	}

}
