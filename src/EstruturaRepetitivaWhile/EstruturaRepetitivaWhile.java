package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		/*
		 * A estrutura While é uma estrutura de controle que repete um bloco de comandos
		 * enquanto uma condição for verdadeira. Quando usar? quando não se sabe
		 * previamente a quantidade de repetições que será realizada
		 * 
		 * Sintaxe / regra 
		 * 
		 * while ( condição ) { 
		 * 		comando 1 
		 * 		comando 2 
		 * }
		 * 
		 * Regra: 
		 * V: executa e volta F: pula fora
		 * 
		 */

		/*
		 * Problema exemplo: Fazer um programa que lê números inteiros até que um zero
		 * seja lido. Ao final mostra a soma dos números lidos.
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println("Soma dos numeros é: " + soma);

		System.out.println("Fique feliz pois foi digitado 0 e o programa rodou :)");

		sc.close();
	}

}
