package EntradaDeDados;

import java.util.Scanner;

public class entradaDeDadosNumeroInteiros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Método usado para associar o meu objeto Scanner ao teclado no modo console.
		
		int x;
		
		x = sc.nextInt();		
		// Permite que o usuário digite um numero INTEIRO e esse numero seja atribuída a variável X

		System.out.println("Voce digitou: " + x);

		sc.close();
		// Encerrar o recurso criado
	}

}
