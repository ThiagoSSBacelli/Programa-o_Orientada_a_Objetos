package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDadosNumeroPontoFlutuantes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		// M�todo usado para associar o meu objeto Scanner ao teclado no modo console.

		Double x;

		/* Para considerar o separador de decimais como ponto, ANTES da declara��o do
		  Scanner, fa�a: Locale.setDefault(Locale.US);*/

		x = sc.nextDouble();
		// Permite que o usu�rio digite um numero INTEIRO e esse numero seja atribu�da a vari�vel X

		System.out.println("Voce digitou: " + x);

		sc.close();
		// Encerrar o recurso criado
	}

}
