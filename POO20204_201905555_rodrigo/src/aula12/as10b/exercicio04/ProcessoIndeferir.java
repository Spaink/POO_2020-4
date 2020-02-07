package aula12.as10b.exercicio04;

public class ProcessoIndeferir implements Processo {

	@Override
	public void Protocolar(Processos p) {
		System.out.println("Não posso ser protocolado novamente");

	}

	@Override
	public void Deferir(Processos p) {
		p.setProcessoAtual(new ProcessoDeferir());

	}

	@Override
	public void Indeferir(Processos p) {
		 System.out.println("Já estou indeferido");

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
