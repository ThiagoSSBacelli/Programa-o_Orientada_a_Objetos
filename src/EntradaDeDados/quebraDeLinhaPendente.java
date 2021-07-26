package EntradaDeDados;

import java.util.Scanner;

public class quebraDeLinhaPendente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		int x;

		x = sc.nextInt();
		// Quando você usa um comando de leitura diferente do nextLine() e dá alguma
		// quebra de linha, essa quebra de linha fica "pendente" na entrada padrão

		sc.nextLine();
		// Solução: Faça um nextLine() extra antes de fazer o nextLine() de seu
		// interesse.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
