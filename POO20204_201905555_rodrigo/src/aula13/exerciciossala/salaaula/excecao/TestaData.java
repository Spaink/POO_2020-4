package aula13.exerciciossala.salaaula.excecao;

public class TestaData {

	public static void main(String[] args) {
		
		String hoje = "05/02/2020";
		try {
			System.out.println(FormataData.convertStringToDate(hoje));
		} catch (Exception e) {
			System.out.println("Erro ao converter a data" + e);
		}finally {
			System.out.println("Execução obrigatória");
		}
	}
}
