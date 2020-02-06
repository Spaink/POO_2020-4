package aula13.ex_sala_de_aula13.excecao;

public class TestaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoje = "05/02/2020";
		try {
			System.out.println(FormataData.convertStringToDate(hoje));
		}catch(Exception e){
			System.out.println("Erro ao converter a data " + e);
		}finally {
			System.out.println("Excecução obrigatória");
		}
	}

}
