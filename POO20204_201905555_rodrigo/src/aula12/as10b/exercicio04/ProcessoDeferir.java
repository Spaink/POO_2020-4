package aula12.as10b.exercicio04;

public class ProcessoDeferir implements Processo {

	@Override
	public void Protocolar(Processos p) {
		System.out.println("Não posso ser protocolado!!!");

	}

	@Override
	public void Deferir(Processos p) {
		System.out.println("Já fui deferido");

	}

	@Override
	public void Indeferir(Processos p) {
		p.setProcessoAtual(new ProcessoIndeferir());

	}

	@Override
	public void Cancelar(Processos p) {
		p.setProcessoAtual(new ProcessoCancelar());

	}

	@Override
	public void Arquivar(Processos p) {
		p.setProcessoAtual(new ProcessoArquivar());

	}

}
