package aula13.exerciciossala.salaaula.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
	private PreparedStatement pstmt;
	private Connection connection = null;
	
	public AlunoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	private void criaTabelaAlunos() throws SQLException{
		String sql = "CREATE TABLE IF NOT EXISTS ALUNOS(\n" +
                "ID_ALUNO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL UNIQUE," +
                "EMAL VARCHAR(20) NOT NULL," +
                "ENDERECO VARCHAR(100) NOT NULL" +
                ")";
		
		pstmt = connection.prepareStatement(sql);
			
        pstmt.executeUpdate(sql);

        System.out.println("Tabela Alunos criada com sucesso!");
        
	}
	
	public void persisteAluno(Aluno aluno) {
				
		try { 
			
			criaTabelaAlunos();
			
			String sql = "insert into ALUNOS (id, nome,email,endereco) values (?,?,?)";
			
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta valores
			stmt.setLong(1, aluno.getId());
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getEndereco());
			//executa
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}	
	
	private void fechaConexao() throws SQLException{
		pstmt.close();
        connection.close();
	}
}
