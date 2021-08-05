package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Sintaxe {

	public static void main(String[] args) {
		/*
		 * � uma estrutura de controle que repete um bloco de comandos para um certo
		 * intervalo de valores. Quando usar: quando se sabe previamente a quantidade de
		 * repeti��es, ou o intervalo de valores.
		 * 
		 * 
		 * Sintaxe / regra for ( in�cio ; condi��o ; incremento) { comando 1 comando 2 }
		 * 
		 * Importante
		 * 
		 * Perceba que a estrutura "para" � �tima para se fazer uma repeti��o baseada em
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
		 * exercicio exemplo Fazer um programa que l� um valor inteiro N e depois N
		 * n�meros inteiros. Ao final, mostra a soma dos N n�meros lidos
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
