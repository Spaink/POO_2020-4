package aula12.ex_sala_de_aula12.state;

public class PortaTrancada implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("Porta trancada, destranque-a");

	}

	@Override
	public void fechar(Porta p) {
		System.out.println("J� estou fechada e trancada");

	}

	@Override
	public void trancar(Porta p) {
		System.out.println("J� estou trancada");

	}

	@Override
	public void destrancar(Porta p) {
		p.setEstadoAtual(new PortaTrancada());

	}

}
