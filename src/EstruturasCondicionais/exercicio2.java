package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero inteiro");

		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Numero inteiro é par");
		} else {
			System.out.println("Numero inteiro é impar");
		}
		sc.close();

	}

}
