package aula13.exerciciossala.salaaula.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection(){
		System.out.println("Conectando ao banco de dados");
		try {
		// a linha abaixo não é mais necessária a partir do JDBC 4 (Java 6)
		//Class.forName("org.h2.Driver");
		return DriverManager.getConnection("jdbc:h2:/home/gilmario/poo","admin","admin");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
