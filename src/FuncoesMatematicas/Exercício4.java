package FuncoesMatematicas;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua matricula:");
		int numeroFuncionario = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas nesse m�s:");
		double hotasTreabalhadas = sc.nextDouble();
		System.out.println("Digite o valor da horas trabalhada:");
		double valorHora = sc.nextDouble();
		
		double salario;
		
		salario = hotasTreabalhadas * valorHora;
		
		System.out.println("Matricula do funcinario: " + numeroFuncionario);
		System.out.printf("O salario do funcionario �: R$%.2f%n ",salario);
		
		sc.close();
	}

}
