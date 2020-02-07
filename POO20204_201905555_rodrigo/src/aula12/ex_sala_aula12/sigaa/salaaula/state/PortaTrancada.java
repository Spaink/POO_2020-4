package aula12.ex_sala_aula12.sigaa.salaaula.state;

public class PortaTrancada implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("Estou trancada, preciso ser destrancada primeiro!");

	}

	@Override
	public void fechar(Porta p) {
		System.out.println("Já estou fechada e trancada!");

	}

	@Override
	public void trancar(Porta p) {
		System.out.println("Já estou trancada!");

	}

	@Override
	public void destrancar(Porta p) {
		p.setEstadoAtual(new PortaDestrancada());
	}

}
