package aula09.ex_sala_de_aula09;

public class OracleConnection implements DBConnection {
	
	public void getConnection(String url, String username, String password) {
		System.out.println("Conectado ao Oracle: "
				+ "\nURL" + url + "\nUsu�rio: " + username + "\nPassword: " + password);
	}
}
