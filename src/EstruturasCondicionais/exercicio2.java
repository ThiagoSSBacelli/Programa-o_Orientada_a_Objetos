package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
	 * �mpar.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero inteiro");

		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Numero inteiro � par");
		} else {
			System.out.println("Numero inteiro � impar");
		}
		sc.close();

	}

}
