package FuncoesMatematicas;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses n�meros com uma mensagem explicativa, conforme exemplos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;

		System.out.println("A soma dos dois nvalor �: " + soma);
		System.out.println(
				"Foi criado 3 vari�veis onde, uma (valor1) recebera um valor vindo do usu�rio, e outra o (valor2) recebera outro valor, e a vari�vel soma foi criada para imprimir na tela do usu�rio a soma entre os dois valores digitados");
	sc.close();
	}

}
