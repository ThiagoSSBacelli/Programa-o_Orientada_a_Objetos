package EntradaDeDados;

import java.util.Scanner;

public class entradaDeDadosNumeroInteiros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// M�todo usado para associar o meu objeto Scanner ao teclado no modo console.
		
		int x;
		
		x = sc.nextInt();		
		// Permite que o usu�rio digite um numero INTEIRO e esse numero seja atribu�da a vari�vel X

		System.out.println("Voce digitou: " + x);

		sc.close();
		// Encerrar o recurso criado
	}

}
