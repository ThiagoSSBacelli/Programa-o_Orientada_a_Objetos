package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * codigo1 = 4.00 
		 * codigo2 = 4.50 
		 * codigo3 = 5.00 
		 * codigo4 = 2.00 
		 * codigo5 = 1.50
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Numero do pedido");
		int codigo = sc.nextInt();
		System.out.println("quantidade do pedido");
		int quantidade = sc.nextInt();
		double pagar = 0.00;

		if (codigo == 1) {
			pagar = quantidade * 4.00;
		} else if (codigo == 2) {
			pagar = quantidade * 4.50;
		}else if (codigo == 3) {
			pagar = quantidade * 5.50;
		}else if (codigo == 4) {
			pagar = quantidade * 2.00;
		}else if (codigo == 5) {
			pagar = quantidade * 1.50;
		}
		
		System.out.printf("Valor a pagar é: R$%.2f%n ", pagar);
		
sc.close();
	}

}
