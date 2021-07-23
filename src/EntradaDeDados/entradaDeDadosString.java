package EntradaDeDados;

import java.util.Scanner;

public class entradaDeDadosString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Método usado para associar o meu objeto Scanner ao teclado no modo
											// console.
		String x;
		x = sc.next();//Permite que o usuário digite uma palavra e essa palavra seja atribuída a variável X
		
		System.out.println("Voce digitou: " + x);
		
		sc.close();//Encerrar o recurso criado
	}

}
