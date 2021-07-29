package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio1 {

	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero inteiro");

		int x = sc.nextInt();

		if (x > 0) {
			System.out.println("Numero inteiro é positivo");
		} else {
			System.out.println("Numero inteiro é negativo");
		}
		sc.close();

	}

}
