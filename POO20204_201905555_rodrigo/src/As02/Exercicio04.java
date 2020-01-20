package As02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente c = new Cliente();
		
		System.out.println("Informe o seu saldo médio:");
		c.saldo_medio = sc.nextDouble();
		
		double credito = 0;
		
		if(c.saldo_medio < 200.0) {
			credito = 0;
		}
		
		if(c.saldo_medio >= 201 && c.saldo_medio <= 400) {
			credito = 0.20*c.saldo_medio;
		}
		
		if(c.saldo_medio >= 401 && c.saldo_medio <= 600) {
			credito = 0.30*c.saldo_medio;
		}
		
		if(c.saldo_medio > 600.0) {
			credito = 0.40*c.saldo_medio;
		}
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("O seu saldo médio é " + df.format(c.saldo_medio) + " e o credito = " + df.format(credito));
	}
}
