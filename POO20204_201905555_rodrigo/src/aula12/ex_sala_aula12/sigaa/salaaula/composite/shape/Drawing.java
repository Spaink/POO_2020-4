package aula12.ex_sala_aula12.sigaa.salaaula.composite.shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	//Collection of shapes
	private List<Shape> shapes = new ArrayList<Shape>();
			
	@Override
	public void draw(String fillColor) {
		for(Shape sh : shapes){
			sh.draw(fillColor);
		}	
	}
	
	//adding formaGeometrica to drawing
	public void add(Shape s){
		shapes.add(s);
	}
	
	//removing formaGeometrica from drawing
	public void remove(Shape s){
		shapes.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}

}
