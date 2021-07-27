package FuncoesMatematicas;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código a quantidade e o valor da primeira peça:");
		int codigoPeca1;
		int quantidadePeca1;
		double valorPeca1;
		double valorPago1;
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		System.out.println("Digite o código a quantidade e o valor da segunda peça:");
		int codigoPeca2;
		int quantidadePeca2;
		double valorPeca2;
		double valorPago2;
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		valorPago1 = quantidadePeca1 * valorPeca1;
		valorPago2 = quantidadePeca2 * valorPeca2;

		System.out.printf("A quantidade de peças 1 que voce levará é de %d o valor a ser pago é de R$%.2f%n",
				quantidadePeca1, valorPago1);
		System.out.printf("A quantidade de peças 2 que voce levará é de %d o valor a ser pago é de R$%.2f%n",
				quantidadePeca2, valorPago2);
		sc.close();

	}

}
