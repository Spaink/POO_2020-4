package aula12.as10b.exercicio04;

public class TesteProcesso {

	public static void main(String[] args) {
		
		Processos p = new Processos();
		System.out.println(p.getProcessoAtual().getClass().getSimpleName());	
		p.Protocolar();
		System.out.println(p.getProcessoAtual().getClass().getSimpleName());
		p.Deferir();
		System.out.println(p.getProcessoAtual().getClass().getSimpleName());
		p.Indeferir();
		p.Protocolar();
		System.out.println(p.getProcessoAtual().getClass().getSimpleName());
		p.Cancelar();
		System.out.println(p.getProcessoAtual().getClass().getSimpleName());
		p.Arquivar();
		System.out.println(p.getProcessoAtual().getClass().getSimpleName());
		p.Arquivar();
	}

}
