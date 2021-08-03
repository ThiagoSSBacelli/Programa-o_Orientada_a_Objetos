package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		/*
		 * A estrutura While � uma estrutura de controle que repete um bloco de comandos
		 * enquanto uma condi��o for verdadeira. Quando usar? quando n�o se sabe
		 * previamente a quantidade de repeti��es que ser� realizada
		 * 
		 * Sintaxe / regra 
		 * 
		 * while ( condi��o ) { 
		 * 		comando 1 
		 * 		comando 2 
		 * }
		 * 
		 * Regra: 
		 * V: executa e volta F: pula fora
		 * 
		 */

		/*
		 * Problema exemplo: Fazer um programa que l� n�meros inteiros at� que um zero
		 * seja lido. Ao final mostra a soma dos n�meros lidos.
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println("Soma dos numeros �: " + soma);

		System.out.println("Fique feliz pois foi digitado 0 e o programa rodou :)");

		sc.close();
	}

}
