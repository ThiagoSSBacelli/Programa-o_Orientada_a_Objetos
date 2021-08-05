package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Sintaxe {

	public static void main(String[] args) {
		/*
		 * É uma estrutura de controle que repete um bloco de comandos para um certo
		 * intervalo de valores. Quando usar: quando se sabe previamente a quantidade de
		 * repetições, ou o intervalo de valores.
		 * 
		 * 
		 * Sintaxe / regra for ( início ; condição ; incremento) { comando 1 comando 2 }
		 * 
		 * Importante
		 * 
		 * Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em
		 * uma CONTAGEM:
		 * 
		 * for (int i=0; i<5; i++) { System.out.println("Valor de i: " + i); }
		 * 
		 * Contagem regressiva
		 * 
		 * for (int i=4; i>=0; i--) { System.out.println("Valor de i: " + i); }
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		/*
		 * exercicio exemplo Fazer um programa que lê um valor inteiro N e depois N
		 * números inteiros. Ao final, mostra a soma dos N números lidos
		 */
		
		int n = sc.nextInt();
		
		int soma = 0;
		for(int i=0 ; i<n ; i++ /* i++ = i = i + 1*/) {
			int x = sc.nextInt();
			soma += x;
		}

		System.out.println(soma);
		
		sc.close();

	}

}
