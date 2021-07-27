package FuncoesMatematicas;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua matricula:");
		int numeroFuncionario = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas nesse mês:");
		double hotasTreabalhadas = sc.nextDouble();
		System.out.println("Digite o valor da horas trabalhada:");
		double valorHora = sc.nextDouble();
		
		double salario;
		
		salario = hotasTreabalhadas * valorHora;
		
		System.out.println("Matricula do funcinario: " + numeroFuncionario);
		System.out.printf("O salario do funcionario é: R$%.2f%n ",salario);
		
		sc.close();
	}

}
