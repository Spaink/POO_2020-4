package aula12.ex_sala_de_aula12.state;

public class Porta {
	
	EstadosPorta estadoAtual;
	
	public Porta() {
		estadoAtual = new PortaFechada();
	}
	
	public void abrir(){
		estadoAtual.abrir(this);
	}
	
	public void fechar(){
		estadoAtual.fechar(this);
	}
	
	public void trancar(){
		estadoAtual.trancar(this);
	}
	
	public void destrancar(){
		estadoAtual.destrancar(this);
	}
	
	public EstadosPorta getEstadoAtual() {
		return estadoAtual;
	}
	
	public void setEstadoAtual(EstadosPorta estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
		
}
