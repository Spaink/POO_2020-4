package aula12.ex_sala_de_aula12.state;

public class PortaAberta implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("J� estou aberta");

	}

	@Override
	public void fechar(Porta p) {
		p.setEstadoAtual(new PortaFechada());

	}

	@Override
	public void trancar(Porta p) {
		System.out.println("Estou aberta, preciso ser fechada primeiro");
		
	}

	@Override
	public void destrancar(Porta p) {
		System.out.println("N�o � possivel, pois estou aberta!");
		
	}
}
