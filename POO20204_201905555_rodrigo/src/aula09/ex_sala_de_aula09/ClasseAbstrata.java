package aula09.ex_sala_de_aula09;

public abstract class ClasseAbstrata {
	public abstract void metodoAbstrato();
	public void metodoConcreto() {
		System.out.println("Implementa��o do M�todo Concreto." + this.getClass().getSimpleName());
	}
}
