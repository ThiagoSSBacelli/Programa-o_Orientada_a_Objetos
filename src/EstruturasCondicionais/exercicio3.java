package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio3 {
	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero 2 inteiro");

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("Numeros inteiro s�o Multiplos");
		} else {
			System.out.println("Numeros inteiros N�o sao Multiplos");
		}
		sc.close();
	}
}
