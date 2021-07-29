package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio3 {
	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
	 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero 2 inteiro");

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("Numeros inteiro são Multiplos");
		} else {
			System.out.println("Numeros inteiros Não sao Multiplos");
		}
		sc.close();
	}
}
