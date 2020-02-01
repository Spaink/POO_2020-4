package aula10.as08b.exercicio01;

public class Teste {

	public static void main(String[] args) {
		
		// Referente ao exerc�cio 02, como � o mesmo resolvi deixar tudo junto e s� ir acrescentando
		System.out.println("Exerc�cio 02:");
		System.out.println("\n");
		
		Animal cachorro = new Cachorro("Bidu",3);
		Animal cavalo = new Cavalo("Bangar�",8);
		Animal preguica = new Preguica("Cidy",4);
		
		cachorro.emitirSom();
		System.out.println("\n");
		cavalo.emitirSom();
		System.out.println("\n");
		preguica.emitirSom();
		System.out.println("\n");
		
		//Referente ao Exercicio 03
		System.out.println("Exerc�cio 03:");
		System.out.println("\n");
		Veterinario v = new Veterinario();
		
		v.examinar(cachorro);
		System.out.println("\n");
		v.examinar(cavalo);
		System.out.println("\n");
		v.examinar(preguica);
		System.out.println("\n");
		
		//Referente ao Exerc�cio 04
		System.out.println("Exerc�cio 04:");
		System.out.println("\n");
		System.out.println("Zool�gico");
		System.out.println("\n");
		Zoologico z = new Zoologico();
		
		z.jaula[0] = new Crocodilo("fred",12);
		z.jaula[1] = new Elefante("jeff",5);
		z.jaula[2] = new Girafa("karol",3);
		z.jaula[3] = new Hiena("bellamy",7);
		z.jaula[4] = new Leao("berd",9);
		z.jaula[5] = new Lobo("zes",11);
		z.jaula[6] = new Macaco("many",1);
		z.jaula[7] = new Preguica("proteus",2);
		z.jaula[8] = new Tigre("mafu",10);
		z.jaula[9] = new Urso("glauss",8);
		
		for(int i = 0; i < 10; i++){
			System.out.println("Dentro da Jaula de  n�mero: " + (i+1));
			if(z.jaula[i] instanceof Animal){
				((Animal) z.jaula[i]).emitirSom();
				((Animal) z.jaula[i]).correr();
				System.out.println("\n");
			}
		}
		
		
		
	}

}
