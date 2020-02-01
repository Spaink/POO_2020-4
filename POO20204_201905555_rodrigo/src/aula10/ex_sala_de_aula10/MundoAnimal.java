package aula10.ex_sala_de_aula10;

public class MundoAnimal {

	public static void main(String[] args) {
		
		Animal reino[] = new Animal[3];
		
		reino[0] = new Anfibio("Salamandra");
		reino[1] = new Ave("Quero-quero");
		reino[2] = new Peixe("Dourado");
		
		int tam = reino.length;
		
		for(int i = 0; i < tam; i++){
			if(reino[i] instanceof Peixe){ 
				((Peixe) reino[i]).nadar();
			}else {
				reino[i].mover(10,10);
			}
			reino[i].mover(10,10);
		}
		
		/*
		for(Animal a : reino){
			a.mover(10,10);
		}
		*/
	}

}
