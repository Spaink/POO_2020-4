package aula09.ex_sala_de_aula09;

public class ClasseConcreta  extends ClasseAbstrata{

	@Override
	public void metodoAbstrato() {
		System.out.println("Implemetação do método abstrato da classe: " + this.getClass().getSimpleName());
	}
	
	public static void main(String[] args){
		ClasseConcreta cc = new ClasseConcreta();
		cc.metodoAbstrato();
		cc.metodoConcreto();
	}
	
}
