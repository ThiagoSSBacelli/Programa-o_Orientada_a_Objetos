package FuncoesMatematicas;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * 
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio");
		double raio = sc.nextDouble();
		double area = 3.14159;
		double circulo;
		
		circulo = area * Math.pow(raio, 2.0);
	
		
		System.out.printf("O valor da área deste círculo é: %.4f%n", circulo );
		
		sc.close();
	}

}
