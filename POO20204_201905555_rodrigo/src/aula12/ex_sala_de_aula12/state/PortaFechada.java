package aula12.ex_sala_de_aula12.state;

public class PortaFechada implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		p.setEstadoAtual(new PortaAberta());

	}

	@Override
	public void fechar(Porta p) {
		System.out.println("Já estou fechada!");

	}

	@Override
	public void trancar(Porta p) {
		p.setEstadoAtual(new PortaTrancada());
		
	}

	@Override
	public void destrancar(Porta p) {
		System.out.println("Estou fechada, mas não trancada!");
		
	}

}
