package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio1 {

	/*
	 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
	 * negativo ou n�o.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero inteiro");

		int x = sc.nextInt();

		if (x > 0) {
			System.out.println("Numero inteiro � positivo");
		} else {
			System.out.println("Numero inteiro � negativo");
		}
		sc.close();

	}

}
