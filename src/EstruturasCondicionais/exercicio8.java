package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double salarioBruto = sc.nextDouble();
		double salarioLiquido = 0;
		
		if(salarioBruto >= 0.0 && salarioBruto <= 2.000) {
			salarioLiquido = salarioBruto;
			System.out.println(salarioLiquido);
		}
		else if(salarioBruto >= 2000.01 && salarioBruto <= 3000.00) {
			salarioLiquido = salarioBruto - (salarioBruto * 8  / 100);
			System.out.println(salarioLiquido);
		}
		else if(salarioBruto >= 3000.01 && salarioBruto <= 4500.00) {
			salarioLiquido = salarioBruto - (salarioBruto * 18  / 100);
			System.out.println(salarioLiquido);
		}
		else {
			salarioLiquido = salarioBruto - (salarioBruto * 28  / 100);
			System.out.println(salarioLiquido);
		}
		
		sc.close();
	}

}
