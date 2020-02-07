package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Sensores extends Observable {
	
	private List<Observer> observers = new ArrayList<Observer>();
	public boolean movimento;
	
	public Sensores(){};
	public Sensores(Boolean movimento) {};
	
	public boolean isMovimento() {
		return movimento;
	}
	
	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
		this.notifyObservers();
	}
	
	public void registraObservador(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update(null,true);
		}
	}
}
