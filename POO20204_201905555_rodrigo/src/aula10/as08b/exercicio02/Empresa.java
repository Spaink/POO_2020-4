package aula10.as08b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List <FuncionarioEnsinoBasico> lista01 = new ArrayList <FuncionarioEnsinoBasico> ();
	private List <FuncionarioEnsinoMedio> lista02 = new ArrayList <FuncionarioEnsinoMedio> ();
	private List <FuncionarioEnsinoSuperior> lista03 = new ArrayList <FuncionarioEnsinoSuperior> ();
	
	public List<FuncionarioEnsinoBasico> getLista01() {
		return lista01;
	}
	
	public void setLista01(List<FuncionarioEnsinoBasico> lista01) {
		this.lista01 = lista01;
	}
	
	public List<FuncionarioEnsinoMedio> getLista02() {
		return lista02;
	}
	
	public void setLista02(List<FuncionarioEnsinoMedio> lista02) {
		this.lista02 = lista02;
	}
	
	public List<FuncionarioEnsinoSuperior> getLista03() {
		return lista03;
	}
	
	public void setLista03(List<FuncionarioEnsinoSuperior> lista03) {
		this.lista03 = lista03;
	}
	
	public void armazena01(FuncionarioEnsinoBasico feb){
		lista01.add(feb);
	}
	
	public void armazena02(FuncionarioEnsinoMedio fem){
		lista02.add(fem);
	}
	
	public void armazena03(FuncionarioEnsinoSuperior fes){
		lista03.add(fes);
	}
	
	public double tot01(){
		double tot1 = 0.0;
		for(FuncionarioEnsinoBasico f : this.lista01) {
			tot1 += f.getSalario();
		}
		return tot1;
	}
	
	public double tot02(){
		double tot2 = 0.0;
		for(FuncionarioEnsinoMedio f : this.lista02) {
			tot2 += f.getSalario();
		}
		return tot2;
	}
	
	public double tot03(){
		double tot3 = 0.0;
		for(FuncionarioEnsinoSuperior f : this.lista03) {
			tot3 += f.getSalario();
		}
		return tot3;
	}
	
	
}
