package As02;

class Carro {
	double custo_fabrica;
	
	double custo_carro(double custo_fabrica) {
		double custo;
		custo = ((1.28*custo_fabrica)*1.45);
		return custo;
	}
}
