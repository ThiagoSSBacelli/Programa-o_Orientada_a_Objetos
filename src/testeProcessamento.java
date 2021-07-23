package Processamento;

public class testeProcessamento {

	public static void main(String[] args) {

		int x, y;

		x = 5;

		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		System.out.println("**************************");

		double k;
		int l;

		l = 5;

		k = 2 * l;

		System.out.println(l);
		System.out.println(k);

		System.out.println("**************************");

		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.println("A Area do Quadrado é " + area);

		System.out.println("**************************");

		int a, m;
		double resultado;

		a = 5;
		m = 2;

		resultado = a / m; // o resultado sera 2,0 por que o java entende que a divisão é de numeros
							// inteiros.
		// para que o resultado sai de forma correta (2,5) é necessario fazer um kestine
		// que é:
		// Colocar o tipo (Double) no calculo, assim como mostra no exemplo abaixo.

		System.out.println(resultado);

		System.out.println("**************************");

		int a1, m1;
		double resultado1;

		a1 = 5;
		m1 = 2;

		resultado1 = (double) a1 / m1; // o Double entre parenteses é o Kestine

		System.out.println(resultado1);

		System.out.println("**************************");

		double a2;
		int b2;

		a2 = 5.0;
		b2 = (int) a2;

		System.out.println(b2);
	}

}
