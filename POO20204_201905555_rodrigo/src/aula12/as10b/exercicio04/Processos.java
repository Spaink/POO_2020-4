package aula12.as10b.exercicio04;

public class Processos {
	
	Processo processoAtual;

	public Processo getProcessoAtual() {
		return processoAtual;
	}

	public void setProcessoAtual(Processo processoAtual) {
		this.processoAtual = processoAtual;
	}

	public Processos() {
		processoAtual = new ProcessoProtocolar();
	}
	
	public void Protocolar() {
		processoAtual.Protocolar(this);
	}
	
	public void Deferir() {
		processoAtual.Deferir(this);
	}
	
	public void Indeferir() {
		processoAtual.Indeferir(this);
	}
	
	public void Cancelar() {
		processoAtual.Cancelar(this);
	}
	
	public void Arquivar() {
		processoAtual.Arquivar(this);
	}
}
