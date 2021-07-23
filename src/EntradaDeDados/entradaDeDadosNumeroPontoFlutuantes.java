package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDadosNumeroPontoFlutuantes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		// Método usado para associar o meu objeto Scanner ao teclado no modo console.

		Double x;

		/* Para considerar o separador de decimais como ponto, ANTES da declaração do
		  Scanner, faça: Locale.setDefault(Locale.US);*/

		x = sc.nextDouble();
		// Permite que o usuário digite um numero INTEIRO e esse numero seja atribuída a variável X

		System.out.println("Voce digitou: " + x);

		sc.close();
		// Encerrar o recurso criado
	}

}
