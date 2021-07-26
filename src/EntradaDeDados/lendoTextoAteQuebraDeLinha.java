package EntradaDeDados;

import java.util.Scanner;

public class lendoTextoAteQuebraDeLinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		// NextLine é usado para fazer a leitura do texto até a quebra de linha ou sela,
		// para ser feita a leitura de toda a linha e nao apenas a primeira palavra como
		// o Next

		System.out.println("Dados digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
