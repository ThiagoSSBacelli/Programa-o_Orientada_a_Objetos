package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1
		 * at� X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
	
		
		for (int i=5; i <=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("fim");
		sc.close();
		
	}

}
