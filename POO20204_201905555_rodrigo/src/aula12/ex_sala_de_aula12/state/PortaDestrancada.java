package aula12.ex_sala_de_aula12.state;

public class PortaDestrancada implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		p.setEstadoAtual(new PortaAberta());
	}

	@Override
	public void fechar(Porta p) {
		System.out.println("Já estou fechada e destrancada"); 

	}

	@Override
	public void trancar(Porta p) {
		p.setEstadoAtual(new PortaTrancada());

	}

	@Override
	public void destrancar(Porta p) {
		System.out.println("Já estou destrancada");

	}

}
