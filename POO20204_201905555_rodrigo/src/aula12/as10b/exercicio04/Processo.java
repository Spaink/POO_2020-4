package aula12.as10b.exercicio04;

public interface Processo {
	void Protocolar(Processos p);
	void Deferir(Processos p);
	void Indeferir(Processos p);
	void Cancelar(Processos p);
	void Arquivar(Processos p);
}
