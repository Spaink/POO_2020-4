package aula12.ex_sala_aula12.sigaa.salaaula.state;

public class PortaTeste {

	public static void main(String[] args) {
		Porta p = new Porta();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());	
		p.abrir();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.fechar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.trancar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.abrir();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		
	}

}
