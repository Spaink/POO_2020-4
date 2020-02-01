package aula09.as07b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class TestaGaleria {

	public static void main(String[] args) {
		
		List <Artista> artistas = new ArrayList <Artista>();
		
		Artista a1 = new Artista("Rodrigo","24/05/1999","Anápolis-GO");
		artistas.add(a1);
		Artista a2 = new Artista("Marcos","28/09/1997","Goiânia-GO");
		artistas.add(a2);
		Artista a3 = new Artista("Leandro","12/03/1989","Ceres-GO");
		artistas.add(a3);
		
		ObraDeArte ob1 = new ObraDeArte("Sexta",894.44,"22/02/1900","Disponível","sei lá",a1);
		ObraDeArte ob2 = new ObraDeArte("Quinta",8940.44,"21/01/1800","Disponível","sei lá",a3);
		ObraDeArte ob3 = new ObraDeArte("Madrugada",694.44,"09/12/1999","Vendida","sei lá",a1);
		ObraDeArte ob4 = new ObraDeArte("Choppada",9994.44,"15/06/2020","Disponível","sei lá",a2);
		ObraDeArte ob5 = new ObraDeArte("Java",7314.44,"30/07/2020","Vendida","sei lá",a3);
		
		System.out.println("Dados das Obras ");
		ob1.exibeObra();
		ob2.exibeObra();
		ob3.exibeObra();
		ob4.exibeObra();
		ob5.exibeObra();
		
		a1.armazenaObra(ob1);
		a1.armazenaObra(ob3);
		a2.armazenaObra(ob4);
		a3.armazenaObra(ob2);
		a3.armazenaObra(ob5);
		
		System.out.println("Obras Por Artista");
		
		a1.listaObras(a1.getObras());
		a2.listaObras(a2.getObras());
		a3.listaObras(a3.getObras());
		
		System.out.println("Obras da Galeria");
		for(Artista k : artistas) {
			k.imprimir();;
		}
	}

}
