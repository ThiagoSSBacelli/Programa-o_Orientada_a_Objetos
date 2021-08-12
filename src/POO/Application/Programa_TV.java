package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto_TV;

public class Programa_TV {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto_TV product = new Produto_TV();
		// Intanciando a Classe Produto_TV.
		System.out.println("Enter product date: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		// O produto recebera o nome atribuido a variavel NAME
		// (public class Produto_TV {public String name;)
		System.out.print("Pice: ");
		product.price = sc.nextDouble();
		// O produto recebera o preço que sera atribuido a variavel PRICE
		// (public class Produto_TV {public double price;)
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		// O produto recebera a quantidade que sera atribuido a variavel QUANTITY
		// (public class Produto_TV {public double quantity;)

		System.out.println();
		System.out.println(product);

		System.out.println();
		System.out.println("Quanto do produto sera adicionado no estoque? ");
		int quantity = sc.nextInt();
		// Estamos criando uma variavel para receber a quantidade(quantity) de produtos
		// que sera somada a quantidade total do produto -> (public int quantity;)
		product.addProducts(quantity);
		// Este é o comando usamos para atribuir a quandidade (Quantity) digitada a
		// quantidade ja existente
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Quanto do produto sera removido no estoque? ");
		quantity = sc.nextInt();
		// Estamos usando a mesma variavel da linha 36 para receber a quantidade(quantity) de produtos
		// que sera removida da quantidade total do produto -> (public int quantity;)
		product.removeProducts(quantity);
		// Este é o comando usamos para subitrair a quandidade (Quantity) digitada a
		// quantidade ja existente
		
		System.out.println();
		System.out.println(product);

		sc.close();
	}

}
