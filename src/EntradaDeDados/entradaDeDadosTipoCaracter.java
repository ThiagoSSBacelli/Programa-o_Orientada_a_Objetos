package EntradaDeDados;

import java.util.Scanner;

public class entradaDeDadosTipoCaracter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// M�todo usado para associar o meu objeto Scanner ao teclado no modo console.

		char x;

		x = sc.next().charAt(0);
		// O Comando CHARAT(0) quer dizer que voce pegara apenas o primeiro caracter do
		// que foi digitado pelo usuario Ex: Caminh�o, o retorno sera apenas o C

		System.out.println("Voce digitou: " + x);

		sc.close();
		// Encerrar o recurso criado
	}

}
