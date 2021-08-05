package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */

		Scanner sc = new Scanner(System.in);
		
		double v1 = 0;	
		double v2 = 0;
		double v3 = 0;
		
		int n = 3;
		for (int i=0; i<n; i++) {
			
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			System.out.println("Proxima nota");
					
		}
		
		double media = ((v1*2.0) + (v2*3.0) + (v3*5.0) / 100);
		
		
		System.out.printf("media ponderada é de %.1f%n", media);
		
		sc.close();
	}

}
