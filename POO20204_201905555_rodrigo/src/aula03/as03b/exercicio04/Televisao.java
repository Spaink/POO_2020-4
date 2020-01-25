package aula03.as03b.exercicio04;

public class Televisao {
	
	private int canais;
	private int som;
	
	public int getCanais() {
		return canais;
	}

	public void setCanais(int canais) {
		this.canais = canais;
	}

	public int getSom() {
		return som;
	}

	public void setSom(int som) {
		this.som = som;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("\nCanal: "  + this.getCanais());
		sb.append("\nSom: " + this.getSom());
		sb.append("\n");
		return sb.toString();
		
	}
}
