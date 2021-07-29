package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Hora inicial");
		double horaInicial = sc.nextDouble();

		System.out.println("Hora Final");
		double horaFinal = sc.nextDouble();

		double duracao;

		if (horaInicial > horaFinal) {
			duracao = horaInicial - horaFinal;
		}
		else {
			duracao = horaInicial + horaFinal;
		}

		System.out.println("Duração do jogo é: " + duracao + "horas");

		sc.close();

	}

}
