package aula12.ex_sala_de_aula12.state;

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
