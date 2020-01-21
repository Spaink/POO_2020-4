package aula01.ex_sala_de_aula01.numerosaleatorios02;

class Intervalo {
	int n1;
	int n2;
	
	int maior(int n1, int n2) {
		int M;
		if( n1 > n2) {
			M = n1;
			return M;
		}else {
			M = n2;
			return M;
		}
	}
	
	int menor(int n1, int n2) {
		int m;
		if( n1 < n2) {
			m = n1;
			return m;
		}else {
			m = n2;
			return m;
		}
	}
	
	int qtd(int n1, int n2) {
		int qtd_interval;
		if(n1 > n2) {
			qtd_interval = (n1 - n2) -1;
			return qtd_interval;
		}else {
			qtd_interval = (n2 - n1) -1;
			return qtd_interval;
		}
	}
	
	int soma(int n1, int n2) {
		int s = 0; 
		for(int i = n1 + 1; i < n2; i++) {
			s += i;
		}
		return s;
	}
	int pares(int n1, int n2) {
		int qtd_pares = 0;
		for(int i = n1 + 1; i < n2; i++) {
			if(i%2 == 0) {
				qtd_pares++;
			}
		}
		return qtd_pares;
	}
	int impares(int n1, int n2) {
		int qtd_impares = 0;
		for(int i = n1 + 1; i < n2; i++) {
			if(i%2 != 0) {
				qtd_impares++;
			}
		}
		return qtd_impares;
	}
}
