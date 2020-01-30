package aula09.ex_sala_de_aula09;

public class ConnectionTest {

	public static void main(String[] args) {
		
		String url = "http://localhost:1521/pooDb";
		String username = "usuarioAluno";
		String password = "aluno123";
		DBConnection connection;
		
		//oracle
		connection = new OracleConnection();
		connection.getConnection(url,username,password);
		
		//Mysql
		connection = new MySqlConnection();
		connection.getConnection(url,username,password);
		
		//SQL Server
		connection = new SqlServerConnection();
		connection.getConnection(url,username,password);
		
	}

}
