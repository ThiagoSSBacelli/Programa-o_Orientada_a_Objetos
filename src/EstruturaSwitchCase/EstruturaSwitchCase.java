package EstruturaSwitchCase;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia = null;
		
		/*if (x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terca";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sabado";
		} else {
			dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);*/
		
		// Neste exemplo podemos fazer com que o numero digitado nos informe qual é o dia da semana.
		// no exemplo acima vemos que podemos fazer com if & else encadeados.
		// ja no exemplo abaixo vemos que conseguimos fazer de uma foma mais simples usando 
		// SWITCH que é um comando semelgante ao if & else.
		
		switch (x) {
		case 1: 
			dia = "Domingo";
			break;
		case 2: 
			dia = "Segunda";
			break;
		case 3: 
			dia = "Terça";
			break;
		case 4: 
			dia = "Quarta";
			break;
		case 5: 
			dia = "Quinta";
			break;
		case 6: 
			dia = "Sexta";
			break;
		case 7: 
			dia = "Sabado";
			break;
				
		}
		System.out.println("Dia da semana: " + dia);

		sc.close();
	}

}
