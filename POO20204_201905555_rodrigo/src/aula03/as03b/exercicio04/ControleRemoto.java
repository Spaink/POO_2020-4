package aula03.as03b.exercicio04;

public class ControleRemoto {
	
	
	public ControleRemoto() {}
	
	public void aumentaVolume(Televisao t) {
		int v = t.getSom();
		v++;
		t.setSom(v);;
	}
	
	public void diminuiVolume(Televisao t) {
		int v = t.getSom();
		v--;
		t.setSom(v);;
	}
	
	public void aumentaCanal(Televisao t) {
		int c = t.getCanais();
		c++;
		t.setCanais(c);
	}
	
	public void diminuiCanal(Televisao t) {
		int c = t.getCanais();
		c--;
		t.setCanais(c);
	}
	
	public void trocaCanal(int canal, Televisao t) {
		int k = canal;
		t.setCanais(k);
	}
	
	public int verSom(Televisao t) {
		int s = t.getSom();
		return s;
	}
	
	public int verCanal(Televisao t) {
		int c = t.getCanais();
		return c;
	}
	
	
}
