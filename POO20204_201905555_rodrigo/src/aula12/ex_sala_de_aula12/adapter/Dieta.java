package aula12.ex_sala_de_aula12.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Dieta extends Observable {
	private List <Observer> observers = new ArrayList <Observer> ();
	private double peso;
	
	public Dieta(){}
	public Dieta(double peso) {
		this.peso = peso;
	}

	public void setPeso(Double Peso) {
		this.peso = peso;
		// Quando a altera��o do peso ocorre notifica os observadores.
		this.notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		// Chama o m�todo de atualiza��o dos observers dispon�veis.
		for (Observer ob : observers) {
		System.out.println("Notificando observers!");
		ob.update(null,this.peso);
		}
	}
}
