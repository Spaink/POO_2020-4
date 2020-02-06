package aula12.ex_sala_de_aula12.adapter;

import java.util.Observable;
import java.util.Observer;

public class BalancaDieta implements Observer {

	public void update(double peso) {
		if (peso >= 100) {
			System.out.println("Você ultrapassou o peso limite no sistema!");
		}

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
