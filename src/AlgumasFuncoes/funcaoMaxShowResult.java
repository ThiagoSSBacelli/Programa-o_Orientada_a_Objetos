package AlgumasFuncoes;

import java.util.Scanner;

public class funcaoMaxShowResult {

	public static void main(String[] args) {

		// Função MAX é usada para pegar o maior valor entre as variareis

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com três numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);
		
		showResult(maior);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("maior é: "+ value);
	}
	

}
