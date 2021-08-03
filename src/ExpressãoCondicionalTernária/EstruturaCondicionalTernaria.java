package ExpressãoCondicionalTernária;

import java.util.Scanner;

public class EstruturaCondicionalTernaria {

	public static void main(String[] args) {

		/*
		 * Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em
		 * uma condição. 
		 * 
		 * Sintaxe: ( condição ) ? valor_se_verdadeiro : valor_se_falso 
		 * 
		 * Exemplos: 
		 * 
		 * (* 2 > 4 ) ? 50 : 80 Resultado 80 
		 * 
		 * ( 10 != 3 ) ? "Maria" : "Alex" Resultado "Maria"
		 */
		
		Scanner sc = new Scanner(System.in);

		
		/*double preco =sc.nextDouble();
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco *0.05;
		}
		
		System.out.printf("O do desconto é de: R$ %.2f%n", desconto);
		*/
		
		// Podemos implificar o codigo acima usando a Estrutura Condicional Ternaria 
		// O exemplo abaixo nos mostra como fazer isso.
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O do desconto é de: R$ %.2f%n", desconto);
		
		sc.close();
	}

}
