package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */

		/*Scanner sc = new Scanner(System.in);

		// int n = sc.nextInt();
		// for (int i = 0; i < n; i++) {

		int valor = sc.nextInt();
		int antecessor = valor - 1;
		int resultado = 0;

		for (int i=0; i<valor; i++) {
			
			if(antecessor > 0) {
				 valor = antecessor;
				 resultado = valor * antecessor;
			}
			 System.out.println(resultado);
		}

		// if (antecessor == 1 ) {
		// System.out.println(antecessor);
		// }

		// }

		sc.close();
	}*/
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
