package FuncoesMatematicas;

import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
		 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
		 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o c�digo a quantidade e o valor da primeira pe�a:");
		int codigoPeca1;
		int quantidadePeca1;
		double valorPeca1;
		double valorPago1;
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		System.out.println("Digite o c�digo a quantidade e o valor da segunda pe�a:");
		int codigoPeca2;
		int quantidadePeca2;
		double valorPeca2;
		double valorPago2;
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		valorPago1 = quantidadePeca1 * valorPeca1;
		valorPago2 = quantidadePeca2 * valorPeca2;

		System.out.printf("A quantidade de pe�as 1 que voce levar� � de %d o valor a ser pago � de R$%.2f%n",
				quantidadePeca1, valorPago1);
		System.out.printf("A quantidade de pe�as 2 que voce levar� � de %d o valor a ser pago � de R$%.2f%n",
				quantidadePeca2, valorPago2);
		sc.close();

	}

}
