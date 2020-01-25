package aula04.ex_sala_de_aula04.heranca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends PessoaFisica{
		private double renda;
		private List <String> interesses;
		private String profissao;
		
		public Cliente(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil, double renda, String profissao){
			super(nome, endereco, telefone, cpf, estadoCivil, sexo);
			this.renda = renda;
			this.profissao = profissao;
			interesses = new ArrayList<String>();
		}	
		
		public double getRenda() {
			return renda;
		}

		public void setRenda(double renda) {
			this.renda = renda;
		}

		public List<String> getInteresses() {
			return interesses;
		}

		public void setInteresses(List<String> interesses) {
			this.interesses = interesses;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		
		public void adicionarInteresse(String interesses) {
			this.getInteresses().add(interesses);
		}
		
		public String consultaInteresse(String interesse) {
			String novoInteresse = null;
			for(String s : this.getInteresses()){
				if(s.equals(interesse)) {
					novoInteresse = s;
				}
			}
			return novoInteresse;
		}
		
		public void removeInteresse(String nomeInteresse) {
			Iterator <String> iterator = interesses.iterator();
			int quantidadeInteresses = interesses.size();
			while(iterator.hasNext()) {
				String interesseRemover = iterator.next();
				if(interesseRemover.equals(nomeInteresse)) {
					iterator.remove();
				}
			}
			
			int novaQuantidadeInteresses = interesses.size();
			
			if(novaQuantidadeInteresses < quantidadeInteresses) {
				System.out.println("O interesse com o nome: " + nomeInteresse + " foi removido com sucesso!!!");
			}else {
				System.out.println("Nenhum interesse com o nome " + nomeInteresse + " foi encontrado");
			}
		}
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append(super.toString());
			sb.append("\nRenda do Cliente: " + this.getRenda());
			sb.append("\nProfissão do Cliente: " + this.getProfissao());
			return sb.toString();
		}	
}
