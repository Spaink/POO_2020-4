package aula12.as10b.exercicio04;

public class ProcessoCancelar implements Processo {

	@Override
	public void Protocolar(Processos p) {
		System.out.println("Não posso ser protocolado, pois fui cancelado");

	}

	@Override
	public void Deferir(Processos p) {
		System.out.println("Não posso ser deferido, pois fui cancelado");

	}

	@Override
	public void Indeferir(Processos p) {
		System.out.println("Não posso ser indeferido, pois fui cancelado");

	}

	@Override
	public void Cancelar(Processos p) {
		System.out.println("Já estou cancelado!!!");

	}

	@Override
	public void Arquivar(Processos p) {
		p.setProcessoAtual(new ProcessoArquivar());
	}

}
