package EntradaDeDados;

import java.util.Scanner;

public class quebraDeLinhaPendente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		int x;

		x = sc.nextInt();
		// Quando voc� usa um comando de leitura diferente do nextLine() e d� alguma
		// quebra de linha, essa quebra de linha fica "pendente" na entrada padr�o

		sc.nextLine();
		// Solu��o: Fa�a um nextLine() extra antes de fazer o nextLine() de seu
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
