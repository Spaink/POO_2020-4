package aula13.exerciciossala.salaaula.persistencia.jdbc;

import java.sql.SQLException;

public class CriaAluno {
	public static void main(String[] args) throws SQLException {
		Aluno aluno = new Aluno();
		aluno.setNome("Jack");
		aluno.setEmail("jack@gmail.com");
		aluno.setEndereco("Av. dos Estados, 5001");
		aluno.setId(new Long(3)); 
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getEndereco());
		System.out.println(aluno.getId());
		
		AlunoDAO dao = new AlunoDAO();
		try {
			dao.persisteAluno(aluno);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
