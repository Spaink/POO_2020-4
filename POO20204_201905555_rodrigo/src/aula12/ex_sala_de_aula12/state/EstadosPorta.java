package aula12.ex_sala_de_aula12.state;

public interface EstadosPorta {
	void abrir(Porta p);
	void fechar(Porta p);
	void trancar(Porta p);
	void destrancar(Porta p);
}
