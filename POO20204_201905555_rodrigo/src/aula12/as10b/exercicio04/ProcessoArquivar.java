package aula12.as10b.exercicio04;

public class ProcessoArquivar implements Processo {

	@Override
	public void Protocolar(Processos p) {
		p.setProcessoAtual(new ProcessoProtocolar());
	}

	@Override
	public void Deferir(Processos p) {
		System.out.println("Para poder Deferir o processo tem que ser protocolado antes");

	}

	@Override
	public void Indeferir(Processos p) {
		System.out.println("Para poder indeferir ele tem q ser protocolado antes");

	}

	@Override
	public void Cancelar(Processos p) {
		System.out.println("Para poder Cancelar esse Processo precisa ser protocolado novamente");

	}

	@Override
	public void Arquivar(Processos p) {
		System.out.println("Esse Processo já está arquivado!!!");

	}

}
