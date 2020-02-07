package aula12.ex_sala_aula12.sigaa.salaaula.state;

public interface EstadosPorta {
	void abrir(Porta p);
	void fechar(Porta p);
	void trancar(Porta p);
	void destrancar(Porta p);
}
