package aula09.ex_sala_de_aula09;

public class MySqlConnection implements DBConnection {
	
	public void getConnection(String url, String username, String password) {
		System.out.println("Conectado ao MySql: "
				+ "\nURL" + url + "\nUsuário: " + username + "\nPassword: " + password);
	}
	
}
