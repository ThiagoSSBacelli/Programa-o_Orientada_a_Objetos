package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N. Este valor ser? a quantidade de valores inteiros X
		 * que ser?o lidos em seguida. Mostre quantos destes valores X est?o dentro do
		 * intervalo [10,20] e quantos est?o fora do intervalo, mostrando essas
		 * informa??es conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo)
		 */

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i=0; i<X; i++) {
			int n = sc.nextInt();
			if (n >= 10 && n <= 20) {
				 in = in + 1;
				
			} else {
				 out = out + 1;
			}

		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
