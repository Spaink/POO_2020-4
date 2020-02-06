package aula11.as09b.exercicio04;

public class Logger {
	
	private boolean ativo = false;

	private Logger(){}
	public static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean b) {
		this.ativo = b;
	}

	public void log(String s) {
		if (this.ativo)
			System.out.println("LOG : " + s);
	}
}
