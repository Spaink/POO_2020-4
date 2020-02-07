package aula12.as10b.exercicio02;

public class TestFile {

	public static void main(String[] args) {
		
		FileComponets aula12 = new PastaComposite("Aula 12/");
		FileComponets as10b = new FileComposite("Aula 12 - Exercícios da Lista AS10b");
		FileComponets ex_sala_aula12 = new FileComposite("Aula 12 - Exercícios feitos na sala de aula");
		
		FileComponets arq1 = new Arquivo("Exe01.java",12);
		FileComponets arq2 = new Arquivo("Exe02.java",10);
		FileComponets arq3 = new Arquivo("Exe03.java",9);
		FileComponets arq4 = new Arquivo("Exe04.java",15);
		
		FileComponets arq5 = new Arquivo("Pessoa.java",5);
		FileComponets arq6 = new Arquivo("Agenda.java",8);
		FileComponets arq7 = new Arquivo("TestaAgenda.java",4);
		
		((FileComposite)as10b).adicionarArquivo(arq1);
		((FileComposite)as10b).adicionarArquivo(arq2);
		((FileComposite)as10b).adicionarArquivo(arq3);
		((FileComposite)as10b).adicionarArquivo(arq4);
		
		((FileComposite)ex_sala_aula12).adicionarArquivo(arq5);
		((FileComposite)ex_sala_aula12).adicionarArquivo(arq6);
		((FileComposite)ex_sala_aula12).adicionarArquivo(arq7);
		
		((PastaComposite)aula12).adicionarPasta(as10b);
		((PastaComposite)aula12).adicionarPasta(ex_sala_aula12);
		
		aula12.nomePastas();

		as10b.dadosArquivo();
		
		ex_sala_aula12.dadosArquivo();

	}

}
